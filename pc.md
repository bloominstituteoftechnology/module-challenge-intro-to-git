## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is an open source distributed verison control system.

2. What is the difference between Git and GitHub?
Git is the actual version control system, github is a hosting service that allows you to manage and interact with Git repositories.

3. Why do we create a branch?
It allows you to make changes in a separate environment without compromising the integrity of the master branch. 

4. What is the purpose of a Pull Request?
This is how you request the changes you made to be merged into the main project

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout main

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch is to check if there has been any new changes on the remote repository compared to your local repository.
git merge will take contents from 1 branch and integrate or "merge" it with a target branch
git pull will fetch and then merge the contents from remote repository into local repository.

7. What is a merge conflict?
When Git is unable to automatically handle a merge

8. How do you resolve a merge conflict?
You can open the file and make any changes, use git add to stage the content, then create a new commit.