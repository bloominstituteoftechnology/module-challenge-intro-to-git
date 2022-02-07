## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?

Git is a software used for tracking changes in any set of computer files and allows you work on those files among multiple people.

2. What is the difference between Git and GitHub?

Git is a software used for tracking changes in any set of computer files and allows you to work on those files among multiple people, while Github is a cloud-based hosting services that lets you manage your Git repositories.

3. Why do we create a branch? 

Creating a new branch allows you to isolate your changes from the master branch. When you create a branch where you're experimenting with code and a bug is produced you can isolate the problem by going back to that newly created branch instead of trying to debug the whole master file.

4. What is the purpose of a Pull Request?

A pull request lets others know about the changes you've made to a branch in a repository on GitHub.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.

To switch to an existing branch, you can use ' git checkout ' command and pass the name of the branch you want to switch to.

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?

git fetch downloads all changes from the remote repository, but doesn't add the changes into the current branch. git merge merges another branch into the current branch you're in into a single branch. git pull downloads changes and directly merges them into the current branch.

7. What is a merge conflict?

A merge conflict is when Git can't figure out how to automatically integrate new changes when starting and during a merge process.

8. How do you resolve a merge conflict?
Its necessary to know whether the conflict occurs and why it occurs. The easiest way to resolve a merge conflict is to open the conflicting file and make necessary changes and try pushing your changes. 