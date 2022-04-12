## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is software for tracking changes in any set of files, usually used for coordinating work among programmers collaboratively developing source code during software development.
2. What is the difference between Git and GitHub?
Git is a version control system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that lets you manage Git repositories.
3. Why do we create a branch? 
Branching allows each developer to branch out from the original code base and isolate their work from others.
4. What is the purpose of a Pull Request? 
A pull request is a mechanism for a developer to notify team members that a feature or fix, developed on a separate branch, is ready.
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main. 
The easiest way to switch branch is to the use the "git checkout" command and specify the name of the branch you want to switch to.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? 
Git fetch downloads, commits, files, and refs from a remote repository into your local repo. Merging is Git's way of putting a forked history back together again. Git pull is a Git command to update the local version of a repository from a remote.
7. What is a merge conflict? 
A merge conflict is an event that takes places when Git is unable to automatically resolve difference in code between two commits.
8. How do you resolve a merge conflict? 
The easiest way to resolve a conflicted file is to open it and make any necessary changes. After editing the file, we can use the git add a command to stage the new merged content. The final step is to create a new commit with the help of the git commit command. Git will create a new merge commit to finalize the merge.
