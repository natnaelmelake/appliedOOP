Git is a version control system that helps developers track changes in their codebase, collaborate with others, and manage the development process efficiently.
key features of Git and how to use them:

1. Version Control
    Feature: Git tracks changes to files over time, allowing you to revert to previous versions if needed.
    Usage:
    git init: Initializes a new Git repository.
    git add <file>: Stages a file for commit.
    git commit -m "message": Commits staged files with a descriptive message.

2. Branching and Merging
    Feature: Git allows you to create branches to work on different features or fixes independently. You can later merge these branches back into the main codebase.
    Usage:
    git branch <branch_name>: Creates a new branch.
    git checkout <branch_name>: Switches to the specified branch.
    git merge <branch_name>: Merges the specified branch into the current branch.

3. Distributed Development
    Feature: Git is a distributed version control system, meaning every developer has a full copy of the repository, including its history.
    Usage:
    git clone <repository_url>: Clones a remote repository to your local machine.
    git fetch: Retrieves changes from the remote repository without merging them.
    git pull: Fetches changes from the remote repository and merges them into your local branch.

4. Collaboration
    Feature: Git allows multiple developers to work on the same project simultaneously, with tools for resolving conflicts and reviewing code.
    Usage:
    git push: Pushes your changes to the remote repository.
    git pull request or git merge request: Used in collaboration platforms like GitHub or GitLab to request a review and merge of your changes.

5. Staging Area
    Feature: Git has a staging area where you can review and selectively stage changes before committing them.
    Usage:
    git add <file>: Adds changes to the staging area.
    git status: Shows the status of files in the staging area and the working directory.
    git diff: Shows differences between the working directory and the staging area.

