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

1-Git is an Open Source Distributed Version Control System 
2-Git is a version control system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that lets you manage Git 
repositories 
3-If you work as a team and you create a branch, it helps you work independently on independent features. It allows you to isolate your changes from master branch. 
4-When you make pull request, It holds the merge in state that allows other developers to see what is being changed. Once a pull request is opened, you can discuss and review the potential changes with others. 
5- git switch "main-branch-name"
6- git fetch : Download objects and refs from another repository
   git merge : Join two or more development histories together
   git pull  : Fetch from and integrate with another repository or a local branch
7- A merge conflict is an event that takes place when Git is unable to automatically resolve differences in code between two commits.Git can merge the changes automatically only if the commits are on different lines or branches.
8- To resolve a conflicted file is to open it and make any necessary changes. After editing the file, we can use the git add a command to stage the new merged content. The final step is to create a new commit with the help of the git commit command. Git will create a new merge commit to finalize the merge.
