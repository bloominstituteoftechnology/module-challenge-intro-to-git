## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? A version control system  that lets you manage and keep track of your source code history
2. What is the difference between Git and GitHub? 
Git is a version control system and GitHub is a cloud-based hosting service that lets you manage git repositories
3. Why do we create a branch? 
To allow you to isolate your changes form the master branch
4. What is the purpose of a Pull request?
To let you tell others about the changes you've pushed to a branch in a repository
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git switch
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? 
git fetch pulls in all the commits from your remote but doesn't make any changes to your local files.  git pull is faster but merge conflicts are possible if the remote and the local repositories have done changes at the same place.  git merge incorporates changes form the named commits since the time their histories diverged from the current branch into the current branch
7. What is a merge conflict?  
An event that takes place when Git is unable to automatically resolve differences in code between two commits
8. How do you resolve a merge conflict?  
Open the file and make necessary changes, use git add a command to stage the new merged content, use git commit to make and new commit