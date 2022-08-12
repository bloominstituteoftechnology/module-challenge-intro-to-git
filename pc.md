
## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
git is an open source version controlled system used to remotely handle projects of varying sizes

2. What is the difference between Git and GitHub?
Git is a version control system. Github is a hosting service that lets you manage git repos

3. Why do we create a branch?
to modify the project and keep track of changes without altering the main repo. It allows individuals to isolate and track their work and changes related to it.

4. What is the purpose of a Pull Request?
A pull request allows the main developer to merge content when they are ready and allows management of the main repository 

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout 

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? 
git fetch looks for any branches that do not exist in your local repository but does not merge them with your branch
git merge merges branches into a new local merge commit
git pull does a git fetch followed by a git pull

7. What is a merge conflict?
A merge conflict is when Git cannot resolve code difference between multiple commits

8. How do you resolve a merge conflict?
git mergetool which opens a GUI tool to walk you through each conflict
