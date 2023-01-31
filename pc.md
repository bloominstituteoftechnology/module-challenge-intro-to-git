## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
 - it is a distributed version control system meaning it keeps up with changes made to your files
2. What is the difference between Git and GitHub?
 - git is just the tool that we use to track the changes but github is a place to store repos and collab on projects with multiple devs
3. Why do we create a branch?
 - Using the git checkout -b command
4. What is the purpose of a Pull Request?
 - To show other developers on the same projects what changes you are proposing with your code and allow peer review before having the new code merged into the main branch.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
 - cd .. to move into the parent dir or you can cd "nameOfBranch"
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
 - git fetch tells you if there is anything new in the remote repo but does not bring it into your local repo
 - git merge is when you take the new branch and merge it together with the main branch
 - git pull is when you grab the changes from the main and add them to you local repo
7. What is a merge conflict?
 - When there is conflicting code with the two versions that are trying to merge
8. How do you resolve a merge conflict?
 - review the code that is causing the conflict, alter it to correct that and merge again