## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
   Version control system.

2. What is the difference between Git and GitHub?
   Git a tool to manage your source code history
   GitHub is a hosting service for Git repositories.

3. Why do we create a branch? 
   Creating a new branch allows you to isolate your changes from the master branch

4. What is the purpose of a Pull Request?
   Used to update the local version of a repository from a remote.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
  git checkout main

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
`git fetch` used to download commits, files and references from a remote    repository into the local repository.
`git merge` bringing the changes from one branch into another.
`git pull` copy online repo to update the local repo.

7. What is a merge conflict?
   Merge conflicts occur when competing changes are made to the same line of a file.
  
8. How do you resolve a merge conflict?
   'cd REPOSITORY-NAME'
   'git status'
   Open text editor and navigate to the file that has merge conflicts.
   search the file for the conflict 
   make a brand new change
   Add or stage your changes. 'git add'
   Commit your changes with a comment.'git commit -m' command.
