#!/usr/bin/env python3
"""
Generate a summary of SDK changes from git diff for Fabric API sync PRs.

This script analyzes changes in the services/fabricv4 directory and produces
a summary of added, modified, removed, and renamed models and API classes.

The script compares the current branch against the main branch (origin/main)
to detect all changes made during the sync process.

Output format:
- Added models (alphabetically sorted list)
- Modified models (alphabetically sorted list)
- Breaking Changes section containing:
  - Modified API classes
  - Removed API classes
  - Removed models
  - Renamed classes

Usage:
    python3 generate_sync_summary.py

The script is typically called from the sync-fabricv4.yaml GitHub Actions workflow
after generating the client code from the API spec.
"""

import subprocess
import sys
import re
from collections import defaultdict

def run_git_command(cmd):
    """Execute a git command and return output."""
    try:
        result = subprocess.run(cmd, shell=True, capture_output=True, text=True, check=True)
        return result.stdout
    except subprocess.CalledProcessError as e:
        print(f"Error running git command: {e}", file=sys.stderr)
        return ""

def parse_diff_name_status():
    """Parse git diff --name-status to detect file changes."""
    # First try to get changes in the current branch vs main
    cmd = "git diff --name-status origin/main...HEAD --diff-filter=ACDMR -- services/fabricv4/"
    output = run_git_command(cmd)
    
    # If that fails, try comparing with staging area
    if not output.strip():
        cmd = "git diff --name-status --cached --diff-filter=ACDMR -- services/fabricv4/"
        output = run_git_command(cmd)
    
    # If still nothing, try uncommitted changes
    if not output.strip():
        cmd = "git diff --name-status HEAD --diff-filter=ACDMR -- services/fabricv4/"
        output = run_git_command(cmd)
    
    changes = {
        'added_models': [],
        'modified_models': [],
        'removed_models': [],
        'renamed_models': [],
        'added_apis': [],
        'modified_apis': [],
        'removed_apis': [],
        'renamed_apis': []
    }
    
    for line in output.strip().split('\n'):
        if not line:
            continue
        
        parts = line.split('\t')
        status = parts[0]
        
        # Handle different status types
        if status.startswith('R'):  # Renamed
            old_file = parts[1]
            new_file = parts[2]
            if '/model/' in old_file and '/model/' in new_file:
                old_name = extract_class_name(old_file)
                new_name = extract_class_name(new_file)
                changes['renamed_models'].append((old_name, new_name))
            elif '/api/' in old_file and '/api/' in new_file:
                old_name = extract_class_name(old_file)
                new_name = extract_class_name(new_file)
                changes['renamed_apis'].append((old_name, new_name))
        elif status == 'A':  # Added
            file_path = parts[1]
            if '/model/' in file_path:
                changes['added_models'].append(extract_class_name(file_path))
            elif '/api/' in file_path:
                changes['added_apis'].append(extract_class_name(file_path))
        elif status == 'D':  # Deleted
            file_path = parts[1]
            if '/model/' in file_path:
                changes['removed_models'].append(extract_class_name(file_path))
            elif '/api/' in file_path:
                changes['removed_apis'].append(extract_class_name(file_path))
        elif status == 'M':  # Modified
            file_path = parts[1]
            if '/model/' in file_path:
                changes['modified_models'].append(extract_class_name(file_path))
            elif '/api/' in file_path:
                changes['modified_apis'].append(extract_class_name(file_path))
    
    return changes

def extract_class_name(file_path):
    """Extract class name from file path."""
    # Extract filename without .java extension
    filename = file_path.split('/')[-1]
    if filename.endswith('.java'):
        return filename[:-5]
    return filename

def format_summary(changes):
    """Format the changes into a markdown summary."""
    summary_parts = []
    
    # Added models
    if changes['added_models']:
        summary_parts.append("Added models ->")
        for model in sorted(changes['added_models']):
            summary_parts.append(f"* {model}")
        summary_parts.append("")
    
    # Modified models
    if changes['modified_models']:
        summary_parts.append("Modified models ->")
        for model in sorted(changes['modified_models']):
            summary_parts.append(f"* {model}")
        summary_parts.append("")
    
    # Breaking Changes section
    breaking_changes = []
    
    # Modified APIs
    if changes['modified_apis']:
        breaking_changes.append("Modified api classes ->")
        for api in sorted(changes['modified_apis']):
            breaking_changes.append(f"* {api}")
        breaking_changes.append("")
    
    # Removed APIs
    if changes['removed_apis']:
        breaking_changes.append("Removed api classes ->")
        for api in sorted(changes['removed_apis']):
            breaking_changes.append(f"* {api}")
        breaking_changes.append("")
    
    # Removed models
    if changes['removed_models']:
        breaking_changes.append("Removed models ->")
        for model in sorted(changes['removed_models']):
            breaking_changes.append(f"* {model}")
        breaking_changes.append("")
    
    # Renamed classes
    if changes['renamed_models'] or changes['renamed_apis']:
        breaking_changes.append("Renamed classes ->")
        for old_name, new_name in sorted(changes['renamed_models'] + changes['renamed_apis']):
            breaking_changes.append(f"* {old_name} -> {new_name}")
        breaking_changes.append("")
    
    # Add breaking changes if any exist
    if breaking_changes:
        summary_parts.append("### Breaking Changes")
        summary_parts.append("")
        summary_parts.extend(breaking_changes)
    
    return '\n'.join(summary_parts)

def main():
    """Main entry point."""
    changes = parse_diff_name_status()
    summary = format_summary(changes)
    
    if summary.strip():
        print(summary)
    else:
        print("No significant changes detected in models or APIs.")

if __name__ == '__main__':
    main()
