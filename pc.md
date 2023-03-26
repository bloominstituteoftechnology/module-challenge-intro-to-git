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


1.Git is a an open source version control system that aides in source code management.
 
2.Git is a version control system that lets you track and manage code history where as github is a cloud based hosting service that lets you manage git repo's.
 
3.Git branches are used to create separate lines of developments within a git repo. Branches allow multiple devs to work on differnt features to a project simultaneously without affecting each other's work.
 
4.The purpose of a pull request is to facilitate code review and and collaboration between devs. You can leave comments and suggest modifications in pull requests which can ensure that the changes are well-designed, correctly implemented, and do not introduce any unintended side effects.
 
5.git checkout <branch-name>

6.'git fetch' fetches changes from the remote repo but doesn't merge them with the local branch. 'git merge' merges changes from one branch into another branch to create a new commit. 'git pull' is a combination of the two where it fetches changes from the remote repo and merges them into the current branch.

7.A merge conflict is when git is unable to autmoatically merge changes from two different branches. Typically when two or more people modiify the same line of code.

8.To resolve a merge conflict, you can manually edit the conflicted files to remove the conflicts and make the necessary changes. 
