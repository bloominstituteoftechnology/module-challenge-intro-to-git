## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?

Git is a DevOps tool that offers commands. This commands are used for source code management.

2. What is the difference between Git and GitHub?

Git is the commands used to manage and keep track of the source code history. Github is the cloud or container that developers store that repository to host and manage. 

3. Why do we create a branch?

We create a branch in git to separate features in the reposority. This helps us to keep bugs away from our main branch. We also create a branch to have a pointer to a snapshot of these changes. Each branch is created for each bug or feature that is addressed.

4. What is the purpose of a Pull Request?

A pull request is when a developer is requesting to pull their changes/bug fixes from their local repository into the main branch in the github repository (or another place the repository is being hosted.) That request is then sent to their peers or senior developer to approve those code changes. Once approved the local repository updates the specific files changes in the github repo.

This opens up dialogue about the potentional changes to the files.


5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.

'git switch main'is the command I would use to switch back to main.


6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?

git pull is the combination of two commands, git fetch followed by git merge. 

git fetch downloads the content from the specific remote repository. 

git merge is to merge the remote content ref and heads into a brand new local merge commit.


7. What is a merge conflict?

A merge conflict happens when you merge branches that commits are competing/clashing. This happens when changes are made in the same line or the same file.

8. How do you resolve a merge conflict?

You must chose to keep or delete the branch another person edits in the same file that is located in the new commit.
