## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
A. Git is an "open source distributed version control system". [1]
2. What is the difference between Git and GitHub?
A. Git as afformentioned is a system service. Github is a hosting service for git Git repository systems. [2]
3. Why do we create a branch?
A. We create a branch to avoid creating bugs, adding unneccessary files, and other issues with the main git "production" branch.
4. What is the purpose of a Pull Request?
A. A Pull Request is a method of contributing to a code development project that allows review and testing of the newly contributed code
before merging into the main git "production" branch.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
A. The command: git switch $branchName is used to switch git branches. [4]
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
A. `git pull` retrieves code changes from a remote repository and adds the changes to your local repository.
`git merge` is used to merge Pull Requests / git branches into the main branch.
`git fetch` is used to download objects and "git references" from another repository. [5]
7. What is a merge conflict?
A. A merge conflict is when there are competing commits on a file and git needs direction on what changes to incorporate in the final merge. [6] 
8. How do you resolve a merge conflict?
A. You can resolve a merge conflict in several ways. Some ways include editing conflicting lines in a git editor and removing conflicting files. [3] 

[1] https://git-scm.com/#:~:text=free%20and%20open%20source%20distributed%20version%20control%20system
[2] https://stackoverflow.com/a/13321586/1780666
[3] https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/addressing-merge-conflicts/resolving-a-merge-conflict-using-the-command-line
[4] https://git-scm.com/docs/git-switch
[5] https://git-scm.com/docs/git-fetch
[6] https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/addressing-merge-conflicts/about-merge-conflicts
