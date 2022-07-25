## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
2. What is the difference between Git and GitHub?
3. Why do we create a branch?
4. What is the purpose of a Pull Request?
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
7. What is a merge conflict?
8. How do you resolve a merge conflict?

Answer:
1. Git is an Open Source distributed version control system.
2. Github is for profit cloud based hosting service that manages our repos while Git is an Open source software.
3. We create a branch to isolates our work from team members and the main.
4. Pull request are used to send our contributions in to be edited or eventually submitted into the project as a whole.
5. git checkout is used to switch in between.
6. i.) git fetch - is a primary command used to download contents from a remote repository.
  ii.) git merge - command lets you take the independent lines of development created by git branch and integrate them into a single branch.
 iii.) git pull - command is used to fetch and download content from a remote repository and immediately update the local repository to match that content.
( Once used, you will know that the next time git pull = git fetch + git merge
The fetch and push commands can respectively fetch and push the remote branch, while pull does not directly talk to the remote branch.
The difference between fetch and pull is that git fetch gets the latest version from remote to local without automatic merge
Git pull is to get the latest version remotely and merge it to the local warehouse
From the security point of view, GIT fetch is more secure than git pull, because we can first compare the differences between local and remote, and then selectively merge.
Git push is pushed to the master by default.)
7. A merge conflict is an event that takes place when Git is unable to automatically resolve differences in code between two commits. A conflict arises when two separate branches have made edits to the same line in a file, or when a file has been deleted in one branch but edited in the other.
8. git status command is in frequent use when a working with Git and during a merge it will help identify conflicted files. The most direct way to resolve a merge conflict is to edit the conflicted file.
