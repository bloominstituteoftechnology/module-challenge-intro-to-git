## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
// Git is an open source software where orginally sourced code is freely available and anyone can edit and redistribute the code.
2. What is the difference between Git and GitHub? 
// Git is an open source tool that allows individuals to organize their code and Github is an online service in which developers who use Git can upload or download resources.
3. Why do we create a branch? 
// A branch is an independent line of development. It is useful to create them so that developers can edit code without disrupting the original code. This helps when working on new features and debugging code. 
4. What is the purpose of a Pull Request? 
// A pull request allows all team members to be alerted of updates that were developed on one branch and are ready to be updated to the main branch.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main. 
// The command is git switch.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
// Git fetch downloads commits, files, and refs from a remote repository into your local repo. You have access to what others have been working on. Git merge is git's way of putting a forked history back together again. The git merge command lets you take the independent lines of development created by the git branch and integrate them into a single branch. And git pull is a git command used to update the local version of a repository from a remote. By default, git pull updates the current local working branch (currently checked out branch) and updates the remote-tracking branches for all other branches.
7. What is a merge conflict? 
// Merge conflicts happen when you merge branches that have competing commits, and Git needs your help to decide which changes to incorporate in the final merge.
8. How do you resolve a merge conflict?
// Git can usually reslove conflicts between branches automatically, especially if updates are on different lines or in different files. If updates are on the same line, the computer will not be able to automatically fix this and team members will need to work together to resolve the conflict. 
