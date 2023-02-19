## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a branching version control system designed to allow developers to reload earlier versions of code, work on different copies of the same code without changing the main branch, and judge between different proposed changes.
2. What is the difference between Git and GitHub?
Git is text based program which performs version control tasks, which is downloaded on a local system. GitHub is a graphical interface online which provides access to remote cloud computing.
3. Why do we create a branch?
We create a branch so that we can make changes and experiment to our heart's content without changing the current stable version of a program.
4. What is the purpose of a Pull Request?
A pull request is a request for a branch a developer has been working with to be reviewed and included into the main code base.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
You use git checkout <name of desired branch>. For example "git checkout main." If you are creating a new branch, you need to include -b in between the word checkout and the name of the branch.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
Git fetch downloads and lets you see the current version of the remote project, but you don't have to apply those changes to your own copy of the code. Git merge takes two difference branches and combines them. If there is conflicting information in the branches, this leads to a merge conflict that the user will have to resolve. Git pull is simply the sequence of both steps- first git fetch is called to get the updated version of the remote, then git merge is initiated to merge the remote and the local branches.
7. What is a merge conflict?
A merge conflict is when there is conflicting information in the same line numbers of code between two branches attempting to merge. Also sometimes the files can't merge because the staging area for one isn't clear, in which case it either needs to be cleared or committed to have a clean working tree before merge will work.
8. How do you resolve a merge conflict?
The developer who ran into the merge conflict has to go through and manually alter the files so that they no longer conflict, then attempt the merge again. 