## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
It is an open source software for distributed version control, tracking changes in sets of files.
2. What is the difference between Git and GitHub?
Git is where the version control takes place; Github is a cloud-based system that hosts Git repositories.
3. Why do we create a branch? 
Branches allow users to make changes without changing the master branch. If the change is to be kept it can be merged into the master branch and if not it can be discarded or kept within the local repository.
4. What is the purpose of a Pull Request?
Pull requests allow you to tell others about changes made to a branch in a repository. Changes can be discussed before merging them into the base branch.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout -b main

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
Git fetch allows you to download objects from another repository. Git pull allows you to fetch from and integrate with another repository or local branch. Git merge allows you to take independent lines of development created by git branch and integrate them into a single branch. 

7. What is a merge conflict?
Merge conflicts happen when competing changes are made to the same line of a file or when a person eidts a file and another person deletes the same file.

8. How do you resolve a merge conflict?
You must choose which changes to incorporate from the different branches and create a new commit.
