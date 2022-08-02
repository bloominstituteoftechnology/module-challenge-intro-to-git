## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
   Version Control System, Track changes in any set of files, Save a History of changes.

2. What is the difference between Git and GitHub?
   Git= Version Contro System (local) GitHub= Is a provider of Internet hosting for software development and version control using Git (remote)

3. Why do we create a branch?
   You can use branches to safely experiment with changes to your project. Branches isolate your development work from other branches in the repository. For example, you could use a branch to develop a new feature or fix a bug.

4. What is the purpose of a Pull Request?
   Let you tell others about changes you've pushed to a branch in a repository on GitHub.
   You can discuss and review the potential changes with collaborators and add follow-up commits before your changes are merged into the base branch.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
   git switch

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
   git fech=Download contents from a remote repository ( it dosen't bring changes to local file auto).
   git merge=Incorporates changes from the named commits (since the time their histories diverged from the current branch) into the current branch.
   git pull= Used to fetch and download content from a remote repository and immediately update the local repository to match that content.

7. What is a merge conflict?
   Happen when you merge branches that have competing commits.

8. How do you resolve a merge conflict?
   To resolve a merge conflict caused by competing changes to a file, where a person deletes a file in one branch and another person edits the same file, you must choose whether to delete or keep the removed file in a new commit.
   To resolve a merge conflict caused by competing line changes, you must choose which changes to incorporate from the different branches in a new commit.
