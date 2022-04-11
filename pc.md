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

1. Git is a DevOps tool used for source code management.
2. Git is open source tool developers install locally to manage source code. Github is an online service for developers who use git can connect and upload or download resources.
3. This allows you to isolate your changes from the master branch. 
4. Pull requests let you tell others about changes you have pushed to a github repository.
5. git checkout 
6. Git fetch command downloads commits, files, and refs from a remote repotitory into your local repo.
   Git merge is putting a forked history back together. 
   Git pull is used to fetch and download content from a remote repository and immediately update the loacl repository to match that content.
7. This is an event that takes place when Git is unable to automatically resolve differences in code between two commits.
8. 1 You submit a change.
   2 Somebody else submits a change and that change merges. Now your change has a merge conflict.
   3 Update your local repository.
   4 Download your change.
   5 Rebase your change.
   6 Resolve conflicts manually.
   7 Add the files to the stage.
   8 Complete the rebase process.
   9 Send the rebased patch again for review.