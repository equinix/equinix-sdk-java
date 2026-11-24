#!/bin/bash
#
# Generate the umbrella poms from templates.
#
#   templates/umbrella/root.pom.xml.tmpl -> pom.xml
#   templates/umbrella/sdk.pom.xml.tmpl  -> equinix-sdk-java/pom.xml
#
# The script fills in the version from the "version" file. It also fills in
# one module and one dependency for each services/*/pom.xml file.
# Git ignores the generated poms, so service PRs cannot conflict on them.
# Run this script (or "make generate-poms") after a clone, and after you
# add a service. The CI jobs that run Maven run it too.

set -eu

cd "$(dirname "$0")/.."

version=$(tr -d '[:space:]' < version)
if [ -z "$version" ]; then
  echo "error: the version file is empty" >&2
  exit 1
fi

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

# render TEMPLATE OUTPUT PLACEHOLDER CONTENT_FILE
# Copy TEMPLATE to OUTPUT. Replace the line that holds only PLACEHOLDER with
# the lines of CONTENT_FILE. Replace @VERSION@ with the project version.
render() {
  local template=$1 output=$2 placeholder=$3 content_file=$4

  # The output directory can be missing in a fresh clone, because it holds only ignored files.
  mkdir -p "$(dirname "$output")"

  if ! grep -qxF -- "$placeholder" "$template"; then
    echo "error: $template has no line that holds only $placeholder" >&2
    exit 1
  fi

  local tmp
  tmp=$(mktemp)
  awk -v placeholder="$placeholder" -v content="$content_file" -v version="$version" '
    $0 == placeholder {
      while ((getline line < content) > 0) print line
      close(content)
      next
    }
    {
      gsub(/@VERSION@/, version)
      print
    }
  ' "$template" > "$tmp"
  chmod 644 "$tmp"
  mv "$tmp" "$output"
}

render templates/umbrella/root.pom.xml.tmpl pom.xml @MODULES@ "$module_lines"
render templates/umbrella/sdk.pom.xml.tmpl equinix-sdk-java/pom.xml @DEPENDENCIES@ "$dependency_lines"

echo "Generated pom.xml and equinix-sdk-java/pom.xml for $service_count service(s) at version $version."
