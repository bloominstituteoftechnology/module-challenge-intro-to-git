## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
2. What is the difference between Git and GitHub?
3. Why do we create a branch? 
4. What is the purpose of a Pull Request?
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
7. What is a merge conflict?
8. How do you resolve a merge conflict?


1. Git is an Open Source Distributed Version Control System where it is used to store content. It allows many developers to add content and keep track of the changes.
2. GitHub is a for-profit company that offers a cloud-based git hosting service. It allows individuals and teams to easily use git for version control and collaboration.
3. We create a branch to isolate our work from other team members.
4. The purpose of a Pull Request is to update the local version of a repository from a remote.
5. The command to use to switch between branches is git checkout.
6. The command git `fetch` is used to download commits, files, and refs from a remote repository into your local repo. You can use it to see what other developers has been working on. `git merge` is to put all the forked history back together. `git pull` is to fetch and download content from a remote repository and immediately update the local repository to match that content.
7. A merge conflict is when git is unable to automatically resolve differences in code between two commits.
8. Merge conflicts can be resolved through editing the conflicted file, and using git add to create a new merged content.