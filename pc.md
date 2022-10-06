## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
Git is a version control system that makes it possible to collaborate with other programmers.
2. What is the difference between Git and GitHub?
Git is the version control system, github is where you can upload and clone your repositories from and view all repos that you are working on or have been invited to.
3. Why do we create a branch?
So we are not mutating the original file.
4. What is the purpose of a Pull Request?
To notify other collaborators that there have been changes made.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout main
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch - this command is used to download contents from a remote repo
git merge - this command allows you to put a forked repo back together again. You are notified of any errors between the two and able to resolve any merge conflicts.
7. What is a merge conflict?
merge conflict - when two separate branches have made edits to the same line in a file, or when a file has been deleted in one branch but edited in the other.
8. How do you resolve a merge conflict?
How to resolve - Open the conflicted file and make the necessary changes, after editing you use the git add command to stage the new merged content, finally create a new commit using the git commit command.
