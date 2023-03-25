## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a popular version control system used by software developers to manage source code and track changes to it over time. It was created by Linus Torvalds in 2005 and is now widely used in the software development industry.
2. What is the difference between Git and GitHub?
Git is a version control system that allows developers to manage source code, while GitHub is a web-based platform that provides a place for developers to store and collaborate on Git repositories.
3. Why do we create a branch?
In Git, a branch is a lightweight pointer to a specific commit in a repository's version history. Creating a branch allows developers to work on multiple parallel versions of a codebase, making it easier to collaborate and manage changes.
4. What is the purpose of a Pull Request?
In Git and GitHub, a pull request is a way for developers to propose changes to a codebase and request that those changes be reviewed and merged into the main branch.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
To switch between branches in Git, you can use the "git checkout" command followed by the name of the branch you want to switch to
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch, git merge, and git pull are Git commands that are used to synchronize a local repository with a remote repository, but they differ in how they accomplish this task.

git fetch:

Downloads new changes from the remote repository but does not integrate them into the current branch.
Updates the local copy of the remote branch to match the remote repository's version.
Leaves the current branch unchanged.
Allows you to see changes made in other branches that you don't have locally.
git merge:

Combines changes from different branches into the current branch.
Merges the changes fetched with git fetch into the current branch.
Can result in merge conflicts if there are conflicting changes between the two branches.
Is used to integrate changes from a different branch into the current branch.
git pull:

Downloads new changes from the remote repository and merges them into the current branch in one step.
Is equivalent to running git fetch followed by git merge.
Is useful for updating your local branch with changes from a remote branch quickly and easily.
Can also result in merge conflicts if there are conflicting changes between the local and remote branches.
In summary, git fetch downloads new changes from the remote repository, git merge combines changes from different branches into the current branch, and git pull downloads new changes and merges them into the current branch in one step. Understanding the differences between these commands can help you choose the right one for your particular situation
7. What is a merge conflict?
A merge conflict is a situation that occurs in Git when two or more branches have made changes to the same part of a file, and Git is unable to automatically determine which changes to keep and which to discard when merging those branches together. This typically happens when two or more developers have made changes to the same file or files in a repository, and those changes conflict with each other.
8. How do you resolve a merge conflict?
To resolve a merge conflict in Git, you need to follow these general steps:

Identify the conflicted files: Git will mark the conflicted files with conflict markers <<<<<<<, =======, and >>>>>>> to indicate the conflicting changes. You can use the git status command to see which files have conflicts.

Open the conflicted file(s) in a text editor: You need to manually edit the conflicted file to decide which changes to keep and which to discard. Look for the conflict markers in the file, and edit the file to merge the changes from the conflicting branches.

Choose which changes to keep: Review the conflicting changes, and decide which changes to keep and which to discard. You can keep the changes made in the current branch, the changes made in the other branch, or combine both sets of changes. Be careful not to accidentally delete any important code while resolving the conflict.

Save the changes: Once you have resolved the conflicts in the file, save the changes to the file.

Mark the file as resolved: After saving the changes, use the git add command to mark the file as resolved. For example, if you have resolved the conflict in the file example.py, you can run the command git add example.py to stage the resolved changes.

Commit the changes: Once all conflicts have been resolved and all files have been staged using git add, you can create a new commit to finalize the merge using the git commit command.

Complete the merge: After resolving all conflicts and committing the changes, you can use the git merge --continue command to complete the merge process.
