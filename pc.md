## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
- Git is an Open Source Distributed Version Control System.
2. What is the difference between Git and GitHub?
- git is the software we install to work on a repo on local machine, while github GitHub is a for-profit company that offers a cloud-based git hosting service
3. Why do we create a branch? 
- to work on the repo without affecting the main branch
4. What is the purpose of a Pull Request?
- to update the local version of a repository from a remote
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
- git checkout main
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
- git fetch is the command that tells your local git to retrieve the latest meta-data info from the original (yet doesn’t do any file transferring. It’s more like just 
checking to see if there are any changes available).
git pull on the other hand does that AND brings (copy) those changes from the remote repository.
The git merge command lets you take the independent lines of development created by the git branch and integrate them into a single branch.
7. What is a merge conflict?
- happen when you merge branches that have competing commits
8. How do you resolve a merge conflict?
