## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?

Git is a Version Control System (VCS) used to a track a projects history and share then implement those changes to the final project.

2. What is the difference between Git and GitHub?

Git is the VCS while GitHub is the clous server that Git projects are stored in.

3. Why do we create a branch?

To allow for individuals to make changes or and features without tampering with the main project before their add on can be reviewed.

What is the purpose of a Pull Request?

To allow other members of the team to view your code before being merged with the main Git Project.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.

git checkout main

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?

git Fetch checks MetaData to see if there are any new changes to be added to the local repo

Git Pull does the same as git Fetch but not only checks for new files but also adds them to the local repo

Git Merge is used to merge the local repo to the remote repo

7. What is a merge conflict?

When 2 dev pull the main repo, both making changes without creating a branch, after merging the repo back the 1st dev wont see a problem but the 2nd dev wont beable to merge the main has already been changed.

8. How do you resolve a merge conflict?

create a branch
