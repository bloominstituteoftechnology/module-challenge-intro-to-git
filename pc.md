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

Answers:

1. Git is a version control system that tracks the changes made to code over time, whether they're very  large or very small--Git has that information stored.
2. GitHub is not the same thing as Git. GitHub is simply a cloud-based storage system for your repositories Github is a service as opposed to a software and it is intended to make collaboration on Git more straight- forward. 
3. Branches are created so that you don't always have to alter the main code, which, in the case of a mistake, could potentially cause larger problems that take a long time to undo. Branching lets you duplicate and edit on your own which is good on large teams especially, when many people may be trying to edit the same code.
4. Pull requests tell other people working on code that you essentially are proposing the following changes and you can all take a look at what's different before merging it into the main code. It allows for good communication even at a distance and notifies everyone involved of the developments made.
5. You can switch branches by using the git checkout command. $ git checkout master
6. git fetch doesn't attempt to merge anything, it just checks for changes made to the code in a remote setting. git pull updates your local repository with changes made to the remote repository. git merge combines branches into the main repository to update with the new changes, but you have to use git fetch first to actually update the master code.
7. Merge conflicts occur when multiple people are trying to make changes to the same thing and they cannot coexist. An example would be one person updating a file and another person deleting it. These cannot merge.
8. You can abort the merge by entering the command git merge --abort, or you can observe exactly where the conflict lies by entering the command git log --merge or git diff if you only want to see the differences. It may be advisable to open the file in question and make the necessary changes and then remerge the content.

