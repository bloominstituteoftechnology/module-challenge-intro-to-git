## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is an open source distributed version control system

2. What is the difference between Git and GitHub?
Git is used locally to manage code, while GitHub is an online service we can use to upload and download resources.

3. Why do we create a branch? 
We create a branch so that we can make edits to code and submit it for review without actually changing the original source code or our live code. This way mistakes can be caught before they go live.

4. What is the purpose of a Pull Request?
Pull requests let you tell others about changes you've pushed to Github. Then others can review the changes and open discussion.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
$ git checkout <branch>

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
$ git fetch <remote> - download all changes from <remote>, but don't integrate into HEAD
$ git merge <branch> - merges <branch> into your current HEAD
$ git pull <remote> - download changes and directly merge/integrate into HEAD

7. What is a merge conflict?
A merge conflict is an event that takes place when Git is unable to automatically resolve differences in code between two commits. 

8. How do you resolve a merge conflict?
Open the file and make any necessary changes
Use the git add command to stage the new merged content
Create a new commit with the help of the git commit command
Git will create a new merge commit to finalize the merge