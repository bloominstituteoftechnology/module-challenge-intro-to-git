## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
- Git is a version control software that allows developers to modify, add, or delete code. More importantly, it is record-tracking software such that every edit made is stamped. This allows developers to revert back to a previous version of the code, should a bug be introduced following a commit.

2. What is the difference between Git and GitHub? 
- GitHub is simply a hosting service that allows you to Manage git repositories

3. Why do we create a branch? 
- We create a branch so that we do not alter the main code. Branches are usually created when trying to fix a bug or add a feature, thus it is experimental in nature and may result in a bug. It would be less than ideal to commit this into the main branch, which is why we create a separate branch

4. What is the purpose of a Pull Request?
- Pull requests are used to compare code between branches. This will let developers determine whether or not merging the newly created branch is wise and/or necessary. 
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
- git checkout

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
- git fetch checks to see if any changes have been made in the remote repo
- git pull also does this but it actually updates the local repository with the changes (if any)
- git merge is used to merge code between two branches

7. What is a merge conflict?
- merge conflict occurs when git is not able to resolve the difference between commits. This can occur when the same line of code has two different codes on two different commits.

8. How do you resolve a merge conflict?
- You will have to select which commit you want to merge into the current branch
