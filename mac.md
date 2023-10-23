## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
-Git is a DevOps tool used for source code management. It is a free and open-source version control system used to handle small to very large projects efficiently. Git is used to tracking changes in the source code, enabling multiple developers to work together on non-linear development.

2. What is the difference between Git and GitHub?

Git vs GitHub: What's the Difference?
-Git is a version control system that allows developers to track changes in their code. GitHub is a web-based hosting service for git repositories.

3. Why do we create a branch? 
-Creating a new branch allows you to isolate your changes from the master branch. 

4. What is the purpose of a Pull Request?
-Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub. 

5. What is the command you can use to switch between branches? For example you are working on -FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout main to switch to that branch.

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
Git fetch fetches the changes while git pull merges them after fetching.
The git merge command lets you take the independent lines of development created by git branch and integrate them into a single branch.

7. What is a merge conflict?
A git merge conflict is an event that takes place when Git is unable to automatically resolve differences in code between two commits. Git can merge the changes automatically only if the commits are on different lines or branches.
8. How do you resolve a merge conflict?

Step 1: The easiest way to resolve a conflicted file is to open it and make any necessary changes. Step 2: After editing the file, we can use the git add a command to stage the new merged content. Step 3: The final step is to create a new commit with the help of the git commit command.
