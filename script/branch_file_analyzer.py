#!/usr/bin/env python3

import subprocess
import sys
import os
from pathlib import Path
from collections import defaultdict


class BranchFileAnalyzer:
    def __init__(self, base_branch='main'):
        self.base_branch = base_branch
        self.current_branch = self._get_current_branch()
        self.base_ref = self._get_base_ref()

        # File categorization
        self.added_files = []
        self.modified_files = []
        self.deleted_files = []
        self.renamed_files = {}

    def _run_git_command(self, cmd):
        """Execute git command and return output."""
        try:
            result = subprocess.run(cmd, capture_output=True, text=True, check=True, cwd='.')
            return result.stdout.strip()
        except subprocess.CalledProcessError:
            return ""

    def _get_current_branch(self):
        """Get current branch name."""
        branch = self._run_git_command(['git', 'branch', '--show-current'])
        if not branch:
            # Handle detached HEAD
            head_commit = self._run_git_command(['git', 'rev-parse', '--short', 'HEAD'])
            return f"HEAD-{head_commit}" if head_commit else "unknown"
        return branch

    def _get_base_ref(self):
        """Get base reference for comparison."""
        # Try different base references
        for ref in [f'origin/{self.base_branch}', self.base_branch, 'HEAD~1']:
            if self._run_git_command(['git', 'rev-parse', '--verify', ref]):
                return ref
        return 'HEAD~1'  # fallback

    def analyze_branch_changes(self):
        """Analyze all file changes in the current branch."""
        # Get all changed files with their status
        diff_output = self._run_git_command([
            'git', 'diff', '--name-status', f'{self.base_ref}..HEAD'
        ])

        if not diff_output:
            # If no diff between base and HEAD, check uncommitted changes
            print("No committed changes found. Checking uncommitted changes...", file=sys.stderr)
            self._analyze_uncommitted_changes()
            return

        # Process each line of diff output
        for line in diff_output.split('\n'):
            if not line.strip():
                continue

            self._process_file_change(line.strip())

    def _analyze_uncommitted_changes(self):
        """Analyze uncommitted changes if no committed changes found."""
        # Check staged changes
        staged_output = self._run_git_command(['git', 'diff', '--cached', '--name-status'])
        # Check unstaged changes
        unstaged_output = self._run_git_command(['git', 'diff', '--name-status'])
        # Check untracked files
        untracked_output = self._run_git_command(['git', 'ls-files', '--others', '--exclude-standard'])

        # Process staged changes
        for line in staged_output.split('\n'):
            if line.strip():
                self._process_file_change(line.strip())

        # Process unstaged changes
        for line in unstaged_output.split('\n'):
            if line.strip():
                self._process_file_change(line.strip())

        # Process untracked files (treat as added)
        for filepath in untracked_output.split('\n'):
            if filepath.strip():
                self.added_files.append(filepath.strip())

    def _process_file_change(self, line):
        """Process a single file change line."""
        parts = line.split('\t')
        if len(parts) < 2:
            return

        status = parts[0]
        filepath = parts[1]

        # Handle rename operations (R100 old_file new_file)
        if status.startswith('R'):
            if len(parts) >= 3:
                old_file = filepath
                new_file = parts[2]
                self.renamed_files[old_file] = new_file
            return

        # Handle copy operations (C100 old_file new_file)
        if status.startswith('C'):
            if len(parts) >= 3:
                # Treat copies as new files
                new_file = parts[2]
                self.added_files.append(new_file)
            return

        # Handle other status codes
        if status == 'A':
            self.added_files.append(filepath)
        elif status == 'M':
            self.modified_files.append(filepath)
        elif status == 'D':
            self.deleted_files.append(filepath)
        elif status == 'T':
            # Type change (e.g., file to symlink)
            self.modified_files.append(filepath)

    def categorize_files_by_type(self, file_list):
        """Categorize files by their type/extension."""
        categories = defaultdict(list)

        for filepath in file_list:
            file_path = Path(filepath)
            filename = file_path.name

            # Categorize by file type
            if filepath.endswith('.java'):
                if '/model/' in filepath or '/dto/' in filepath:
                    categories['Java Models'].append(filename)
                elif '/api/' in filepath and filename.endswith('Api.java'):
                    categories['API Classes'].append(filename)
                elif '/test/' in filepath or 'test' in filename.lower():
                    categories['Test Files'].append(filename)
                # Removed Java Files category - these files will be ignored
            elif filepath.endswith(('.py', '.sh', '.js', '.ts')):
                categories['Scripts'].append(filename)
            elif filepath.endswith(('.json', '.xml')):
                categories['Data Files'].append(filename)
            else:
                categories['Other Files'].append(filename)

        return categories

    def generate_report(self):
        """Generate the analysis report."""
        lines = []


        # Added Files by category
        if self.added_files:
            # Separate by specific categories
            added_apis = [f for f in self.added_files if f.endswith('.java') and ('/api/' in f and f.endswith('Api.java'))]
            added_models = [f for f in self.added_files if f.endswith('.java') and ('/model/' in f or '/dto/' in f)]

            # Only show header if there are files in any category
            if added_apis or added_models:
                lines.append("ADDED FILES:")

                if added_apis:
                    lines.append("  Added API ->")
                    for filepath in sorted(added_apis):
                        filename = Path(filepath).name.replace('.java', '')
                        lines.append(f"    + {filename}")

                if added_models:
                    lines.append("  Added Models ->")
                    for filepath in sorted(added_models):
                        filename = Path(filepath).name.replace('.java', '')
                        lines.append(f"    + {filename}")

                lines.append("")

        # Modified Files by category
        if self.modified_files:
            # Separate by specific categories
            modified_apis = [f for f in self.modified_files if f.endswith('.java') and ('/api/' in f and f.endswith('Api.java'))]
            modified_models = [f for f in self.modified_files if f.endswith('.java') and ('/model/' in f or '/dto/' in f)]

            # Only show header if there are files in any category
            if modified_apis or modified_models:
                lines.append("MODIFIED FILES:")

                if modified_apis:
                    lines.append("  Modified API ->")
                    for filepath in sorted(modified_apis):
                        filename = Path(filepath).name.replace('.java', '')
                        lines.append(f"    * {filename}")

                if modified_models:
                    lines.append("  Modified Models ->")
                    for filepath in sorted(modified_models):
                        filename = Path(filepath).name.replace('.java', '')
                        lines.append(f"    * {filename}")

                lines.append("")

        # Deleted Files by category
        if self.deleted_files:
            # Separate by specific categories
            deleted_apis = [f for f in self.deleted_files if f.endswith('.java') and ('/api/' in f and f.endswith('Api.java'))]
            deleted_models = [f for f in self.deleted_files if f.endswith('.java') and ('/model/' in f or '/dto/' in f)]

            # Only show header if there are files in any category
            if deleted_apis or deleted_models:
                lines.append("DELETED FILES:")

                if deleted_apis:
                    lines.append("  Deleted API ->")
                    for filepath in sorted(deleted_apis):
                        filename = Path(filepath).name.replace('.java', '')
                        lines.append(f"    - {filename}")

                if deleted_models:
                    lines.append("  Deleted Models ->")
                    for filepath in sorted(deleted_models):
                        filename = Path(filepath).name.replace('.java', '')
                        lines.append(f"    - {filename}")

                lines.append("")

        # Renamed Files with detailed categorization
        if self.renamed_files:
            # Separate renamed files by category
            renamed_apis = {}
            renamed_models = {}


            for old_file, new_file in self.renamed_files.items():
                old_is_api = old_file.endswith('.java') and ('/api/' in old_file and old_file.endswith('Api.java'))
                new_is_api = new_file.endswith('.java') and ('/api/' in new_file and new_file.endswith('Api.java'))
                old_is_model = old_file.endswith('.java') and ('/model/' in old_file or '/dto/' in old_file)
                new_is_model = new_file.endswith('.java') and ('/model/' in new_file or '/dto/' in new_file)

                if old_is_api or new_is_api:
                    renamed_apis[old_file] = new_file
                elif old_is_model or new_is_model:
                    renamed_models[old_file] = new_file


            # Only show header if there are files in any category
            if renamed_apis or renamed_models:
                lines.append("RENAMED FILES:")

                if renamed_apis:
                    lines.append("  Renamed API ->")
                    for old_file, new_file in sorted(renamed_apis.items()):
                        old_name = Path(old_file).name.replace('.java', '')
                        new_name = Path(new_file).name.replace('.java', '')
                        lines.append(f"    {old_name} -> {new_name}")

                if renamed_models:
                    lines.append("  Renamed Models ->")
                    for old_file, new_file in sorted(renamed_models.items()):
                        old_name = Path(old_file).name.replace('.java', '')
                        new_name = Path(new_file).name.replace('.java', '')
                        lines.append(f"    {old_name} -> {new_name}")

                lines.append("")


        return "\n".join(lines)


def main():
    """Main function."""
    # Check if we're in a git repository
    if not os.path.exists('.git'):
        print("Error: Not in a Git repository!", file=sys.stderr)
        sys.exit(1)

    try:
        # Create analyzer
        analyzer = BranchFileAnalyzer()

        # Analyze changes
        analyzer.analyze_branch_changes()

        # Generate and print report
        report = analyzer.generate_report()
        print(report)

    except Exception as e:
        print(f"Error during analysis: {e}", file=sys.stderr)
        sys.exit(1)


if __name__ == '__main__':
    main()
