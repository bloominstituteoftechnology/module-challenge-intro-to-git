## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
A version control system

2. What is the difference between Git and GitHub?
Github is where we store the local git repositories. Git is verision 
control, github is a cloud service to store git repos remotely.

3. Why do we create a branch? 
So we can work on a feature or bug fix without impacting the main branch. 
If you mess up in a new branch, it won't break the original product.

4. What is the purpose of a Pull Request?
To let others know you made changes to a branch in a repo. Pull requests 
are to be reviewed by someone else before they become final and are merged 
into the main branch.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout -b main

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch pulls all the contents from a remote repo
git merge can merge two branches, carrying over changes from one to the 
other
git pull creates a pull request for the current working branch


7. What is a merge conflict?
When git is unable to resolve differences in code between two commits

8. How do you resolve a merge conflict?
use git status to see which files are affected, then edit them so there 
are no conflicts
