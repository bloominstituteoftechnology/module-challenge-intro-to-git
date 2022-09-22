## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is an open source version control system (OSVCS). It allows people to have the same files and edit them at the same time while on different computers/locations.

2. What is the difference between Git and GitHub?
Git is the OSVCS, while GitHub is the browser version that allows you to complete many Git-related actions in the browser.

3. Why do we create a branch?
We create branches to work on the project and without affecting other branches in the repo.

4. What is the purpose of a Pull Request?
So that you can create your're own branch and collaborate on changes to a repo.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch - is adding changes from the remote repo to your local working branch without commiting them.
git merge - this take the changes from one branch and applies them to another, often happens as a pull request.
git pull - is adding changes and commiting them from the remote repo to the local working branch.

7. What is a merge conflict?
A diffrence that occurs when branches have conflicting info whether it is:
people making changes to the same line of the same file or when one person edits a file and another person deleted the same file. Merge conflicts must be resolved before you can merge the branches.

8. How do you resolve a merge conflict?
You must manually edit the conflicted file to select the changes that you want to keep in the final merge.
