#!/bin/bash
#
# Regenerate the service lists in the hand-maintained umbrella poms.
#
# The script scans services/*/pom.xml and rewrites the text between the
# BEGIN GENERATED and END GENERATED marker comments in two files:
#   - pom.xml                   (the <module> entries)
#   - equinix-sdk-java/pom.xml  (the <dependency> entries)
#
# Service PRs must not edit those blocks. The release job runs this script
# through "make generate-all". Run "make generate-poms" to update them locally.

set -eu

cd "$(dirname "$0")/.."

service_count=0
module_lines=$(mktemp)
dependency_lines=$(mktemp)
trap 'rm -f "$module_lines" "$dependency_lines"' EXIT

for service_pom in services/*/pom.xml; do
  # An unmatched glob stays literal. Skip it.
  [ -f "$service_pom" ] || continue
  service=$(basename "$(dirname "$service_pom")")
  service_count=$((service_count + 1))

  printf '        <module>services/%s</module>\n' "$service" >> "$module_lines"
  {
    printf '        <dependency>\n'
    printf '            <groupId>com.equinix.sdk</groupId>\n'
    printf '            <artifactId>%s</artifactId>\n' "$service"
    printf '            <version>${project.version}</version>\n'
    printf '        </dependency>\n'
  } >> "$dependency_lines"
done

if [ "$service_count" -eq 0 ]; then
  echo "error: no services/*/pom.xml files found" >&2
  exit 1
fi

# replace_block FILE NAME CONTENT_FILE
# Replace the lines between the NAME markers in FILE with CONTENT_FILE.
replace_block() {
  local file=$1 name=$2 content_file=$3
  local begin="<!-- BEGIN GENERATED: $name -->"
  local end="<!-- END GENERATED: $name -->"

  if ! grep -qF -- "$begin" "$file" || ! grep -qF -- "$end" "$file"; then
    echo "error: $file has no BEGIN/END GENERATED markers for $name" >&2
    exit 1
  fi

  local tmp
  tmp=$(mktemp)
  awk -v begin="$begin" -v end="$end" -v content="$content_file" '
    index($0, begin) {
      print
      while ((getline line < content) > 0) print line
      close(content)
      skipping = 1
      next
    }
    index($0, end) { skipping = 0 }
    !skipping { print }
  ' "$file" > "$tmp"
  # Write through cat to keep the mode of the original file.
  cat "$tmp" > "$file"
  rm -f "$tmp"
}

replace_block pom.xml modules "$module_lines"
replace_block equinix-sdk-java/pom.xml dependencies "$dependency_lines"

echo "Updated umbrella poms for $service_count service(s)."
