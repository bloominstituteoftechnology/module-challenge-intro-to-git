## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. 
You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). 
Docs (short for documentation) are the instructions on how to use a languge or program. 
A large part of your job as a developer will be learning how to read and work with documentation. 
Please reference the GitHub docs when answering the questions below. 
If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!


1. What is Git?
2. What is the difference between Git and GitHub?
3. Why do we create a branch?
4. What is the purpose of a Pull Request?
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
7. What is a merge conflict?
8. How do you resolve a merge conflict?

Answers:
1. Git is responsible for everything GitHub-related that happens locally on your computer.
2. Git is a version control system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that lets you manage Git repositories.
3. We create branch to make isolated changes of the code without affecting the master branch.
4. A pull requests let you tell others about changes you've pushed to a branch in a repository on Github.
5. git switch (the branch you want to switch to).
6. git fetch is the command that tells the local repository that there are changes available in the remote repository without bringing the changes into the local repository.
   git pull does the same thing as git fetch and updates the changes into the local repository in contrast to git fetch.
   git merge is a command used to combine changes made on two distinct branches.
7. A merge conflicts happen when two separate branches have made edits to the same line in a file.
8. To resolve a merge conflict caused by competing line changes, you must choose which changes to incorporate from the different branches in a new commit or you can use the GitHub conflict editor.
