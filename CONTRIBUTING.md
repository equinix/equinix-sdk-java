## Contribution guidelines

### Code Changes

No manual code changes should be made. All .java files are generated with the OpenAPI Generator CLI.
If there are updates you think should be made to the generated client then they should be handled
through patches. The patching process is detailed below.

### Patching OAS 3.0 Spec
1. Make changes in ``spec/services/fabricv4/oas3.patched/swagger.yaml`` dir.
2. Create a patch file in equinix-sdk-java:
   ```
   cd spec/services/fabricv4 
   git diff oas3.patched/ > ../patches/spec.fetched.json/<patchfilename>
   cd ..
   ```
3. ``patchfilename`` should be in format: ``<patch_index>-<short_patch_decription_or_identifier>.patch``
4. Run ``make -f Makefile.fabricv4 generate`` to reapply the changes to oas spec.
5. Before pushing changes, commit ``spec/services/fabricv4/oas3.patched/swagger.yaml`` along with the patch file.
