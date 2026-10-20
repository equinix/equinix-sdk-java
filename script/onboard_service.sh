#!/bin/bash
# Onboard a new service to the SDK.
#
# Usage: script/onboard_service.sh <service> [<spec-url>]
#
#   service   short lowercase name, used as the module name and Java package
#             segment (e.g. fabricv4); must be a valid Java identifier
#   spec-url  URL of the OpenAPI document; prompted for when omitted
#
# Set SKIP_GENERATE=1 to scaffold without fetching the spec and generating code.

set -eu

sedi() {
  # in-place sed that works with both GNU and BSD sed
  sed -i.bak "$@"
  rm -f "${@: -1}.bak"
}

service_name=${1:-}
if [ -z "$service_name" ]; then
  echo "What service are you onboarding?"
  read -r service_name
fi
service_name=$(echo "$service_name" | tr '[:upper:]' '[:lower:]')
if ! [[ $service_name =~ ^[a-z][a-z0-9]*$ ]]; then
  echo "service name must be a valid Java package segment (lowercase letters and digits): ${service_name}" >&2
  exit 1
fi
test ! -f "Makefile.${service_name}" || { echo "${service_name} already onboarded"; exit 1; }

spec_url=${2:-}
if [ -z "$spec_url" ]; then
  echo "What is the URL for the OpenAPI spec for ${service_name}?"
  read -r spec_url
fi

spec_root_file=""
possible_spec_filename=${spec_url##*/}
if [[ $possible_spec_filename == *"."* ]]; then
  spec_root_file=$possible_spec_filename
  spec_url=${spec_url%/$spec_root_file}
fi

cp templates/Makefile.sdk "Makefile.${service_name}"
sedi "s/__PACKAGE_NAME__/${service_name}/g" "Makefile.${service_name}"
sedi "s|__SPEC_BASE_URL__|${spec_url}|g" "Makefile.${service_name}"
sedi "s|__SPEC_ROOT_FILE__|${spec_root_file}|g" "Makefile.${service_name}"

cp templates/.github/workflows/sync.yaml ".github/workflows/sync-${service_name}.yaml"
sedi "s/__PACKAGE_NAME__/${service_name}/g" ".github/workflows/sync-${service_name}.yaml"

for dir in spec templates patches; do
  mkdir -p "${dir}/services/${service_name}" && touch "${dir}/services/${service_name}/.keep"
done
mkdir -p "spec/services/${service_name}/oas3.fetched"

# register the generated module in the reactor and the aggregate artifact
if ! grep -q "<module>services/${service_name}</module>" pom.xml; then
  sedi "s|^\( *\)</modules>|\1    <module>services/${service_name}</module>\n\1</modules>|" pom.xml
fi
if ! grep -q "<artifactId>${service_name}</artifactId>" equinix-sdk-java/pom.xml; then
  sedi "s|^\( *\)</dependencies>|\1    <dependency>\n\1        <groupId>com.equinix.sdk</groupId>\n\1        <artifactId>${service_name}</artifactId>\n\1        <version>\${project.version}</version>\n\1    </dependency>\n\1</dependencies>|" equinix-sdk-java/pom.xml
fi

# examples module, compiled with the rest of the reactor so examples can't rot
mkdir -p "examples/${service_name}/src/main/java/com/equinix/sdk/examples/${service_name}"
cp templates/examples/pom.xml "examples/${service_name}/pom.xml"
sedi "s/__PACKAGE_NAME__/${service_name}/g" "examples/${service_name}/pom.xml"
if ! grep -q "<module>${service_name}</module>" examples/pom.xml; then
  sedi "s|^\( *\)</modules>|\1    <module>${service_name}</module>\n\1</modules>|" examples/pom.xml
fi

if [ "${SKIP_GENERATE:-0}" != "1" ]; then
  make -f "Makefile.${service_name}" all
fi
