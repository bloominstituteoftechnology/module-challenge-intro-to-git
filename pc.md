## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
Git is a version control system that allows for the changes in the code to be seen over time, and tracked and agreeded upon, which allows for cleaner code.

2. What is the difference between Git and GitHub? 
Git is a version control system, and Github is an online web application dedicated to public and privately managed websites utilizing Git. 

3. Why do we create a branch? 
We create branches to allow for cleaner code.

4. What is the purpose of a Pull Request? 
To submit sectioned code within a branch for approval to be merged back into the main branch, as well as a way to track changes on the edited code.

5. What is the command you can use to switch between branches? 
For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main. 
git checkout -b main

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch: grabs the code from Github.com to your local machine, so that it is up to date with the code online. It cannot allow for merge conflicts, as no code is being pushed back into the master branch. This also allows for additional code review to be done.   
git pull: automatically merges code into the current branch on the local machine, so that it is uniform. This can cause merge conflicts, as it is an immediate overwrite of all the code. 
git merge:allows for code to be combined between different branches, and updated into one piece of uniform code. There are different ways to merge, and when doing a 3 way merge (where each branch merging has a different parent branch), it is possible ot have merge conflicts, as one portion of code does not match another due to being updated through the merge. The merge also allows for code to be properly reviewed and assessed in order to ensure that it is matches the desire of the team moving forward.

7. What is a merge conflict? A merge conflict occurs when one batch of code does not match another batch of code, when combining, or merging the code into one uniform file.

8. How do you resolve a merge conflict? To resolve a merge conflict, both sets of code need to be reviewed, whether online or via code editor, where under review, a side by side comparison can be made to select the appropriate sets of code that are desired within the final branch.
