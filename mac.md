## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

#1. What is Git?
Git is a popular distributed version control system used for tracking changes in computer files and coordinating work among multiple people on those files. It was created by Linus Torvalds in 2005 for managing the development of the Linux kernel, but has since become widely adopted for software 
development and other collaborative projects.

Git allows multiple developers to work on the same codebase concurrently and keep track of their changes over time. It does this by creating a repository, or a centralized location where all changes to the codebase are stored. Developers can then create branches, or separate versions of the 
codebase, to work on different features or bug fixes. Once changes are made, developers can commit them to their branch and eventually merge them back into the main branch.

One of the key benefits of Git is that it is distributed, meaning that each developer has a local copy of the repository on their computer. This allows for faster access to the codebase and the ability to work offline. Git also offers powerful tools for collaboration, such as pull requests, which 
allow developers to review and comment on each other's changes before merging them into the main branch.

Overall, Git is a powerful tool for managing codebases and coordinating work among multiple developers, making it an essential tool for modern software development.
#2. What is the difference between Git and GitHub?
Git is the underlying tool used for version control, while GitHub is a web-based platform that provides hosting services and additional collaboration tools for Git repositories. While Git can be used without GitHub, GitHub cannot be used without Git, as it is built on top of Git technology.
#3. Why do we create a branch? 
In Git, creating a branch means creating a separate copy of the codebase that can be developed independently from the main branch. Branches are often created when multiple developers are working on the same codebase, or when a developer wants to work on a new feature or bug fix without affecting the 
main branch.

There are several reasons why creating a branch in Git can be beneficial:

Isolation: Creating a branch allows developers to work on changes without affecting the main branch. This makes it easier to experiment with new ideas and test changes before merging them into the main branch.
Collaboration: Branches make it easier for multiple developers to work on the same codebase simultaneously. Each developer can create their own branch and work on their own changes without interfering with each other.
Versioning: Branches allow developers to maintain different versions of the codebase over time. This can be useful for maintaining different releases or creating experimental versions of the codebase.
Rollback: Branches make it easier to rollback changes in case of a mistake. If a change causes issues, developers can simply revert to a previous version of the codebase.
Overall, creating branches in Git is a powerful tool for managing changes to a codebase and collaborating on development with multiple team members.
#4. What is the purpose of a Pull Request?
In Git, a pull request is a mechanism used to propose and review changes to a codebase before they are merged into the main branch.

The purpose of a pull request is to enable collaboration and ensure that any changes made to the codebase are thoroughly reviewed and tested before they are integrated into the main branch. The pull request process typically involves the following steps:

Creating a branch: The developer creates a new branch in Git to work on their changes.
Making changes: The developer makes the necessary changes to the codebase in their branch.
Creating a pull request: The developer opens a pull request to propose their changes to the main branch.
Reviewing changes: Other team members review the proposed changes in the pull request, providing feedback and suggesting improvements as necessary.
Testing: The changes are tested to ensure they do not introduce any new bugs or issues.
Merging changes: Once the changes are reviewed and tested, they are merged into the main branch.
Pull requests serve several important purposes:
Collaboration: Pull requests enable developers to collaborate and review each other's code, which helps ensure that changes are well-designed and thoroughly tested.
Code quality: The review process in pull requests helps ensure that changes adhere to coding standards and best practices.
Transparency: Pull requests make it easy to track changes to a codebase over time and understand why they were made.
Risk mitigation: The review and testing process in pull requests can help catch and mitigate potential issues before they are introduced into the main branch.
Overall, pull requests are a powerful tool for maintaining code quality and enabling collaboration among team members.
#5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout
#6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
 git fetch retrieves changes from the remote repository and updates the remote tracking branches in the local repository, git merge merges changes from a remote branch into the local branch, and git pull retrieves changes from the remote repository and automatically merges them into the local 
branch.
#7. What is a merge conflict?
A merge conflict is a situation that occurs when Git is unable to automatically merge changes from different branches. This happens when two or more branches have made changes to the same code or file, and Git is unable to determine which version of the code to keep.

When Git encounters a merge conflict, it will halt the merge process and indicate which files have conflicts. Git will mark the conflicting sections of code with special markers that indicate the two versions of the code that cannot be automatically merged. It is then up to the user to resolve the 
conflict manually by editing the affected files and choosing which changes to keep.

Merge conflicts can occur in any type of file, but they are most common in text-based files such as source code files, configuration files, and documentation. Merge conflicts can be time-consuming to resolve, especially when there are multiple conflicts across many files.

To resolve a merge conflict, you will typically need to:

Identify the conflicting files and the sections of code that have conflicts.
Edit the files to manually resolve the conflicts, choosing which version of the code to keep.
Mark the conflicts as resolved by removing the conflict markers added by Git.
Add the resolved files to the staging area using git add.
Commit the changes using git commit.
It is important to resolve merge conflicts carefully, as resolving conflicts incorrectly can introduce bugs and errors into the codebase.
#8. How do you resolve a merge conflict?
To resolve a merge conflict, you will typically need to:

Identify the conflicting files and the sections of code that have conflicts.
Edit the files to manually resolve the conflicts, choosing which version of the code to keep.
Mark the conflicts as resolved by removing the conflict markers added by Git.
Add the resolved files to the staging area using git add.
Commit the changes using git commit.
It is important to resolve merge conflicts carefully, as resolving conflicts incorrectly can introduce bugs and errors into the codebase.
