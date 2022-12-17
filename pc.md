## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? Git is a software for tracking changes in any set of files, usually used for coordinating work among programmers collaboratively developing source code during software development. Its goals include speed, data integrity, and support for distributed, non-linear workflows (thousands of parallel branches running on different systems).
2. What is the difference between Git and GitHub? Git is a revision control system or software for tracking changes. github is a hosting service for repositories. git is a tool github is the service for projects that uses git
3. Why do we create a branch? When you want to work/test out something in a sandbox enviroment or you want to solve a bug
4. What is the purpose of a Pull Request? A pull requests is a mechanism for a developer to notify team members that a feature or fix, developed on a separate brach, is ready. They can then review the code.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? git fetch gets you the latest version of the data from a remote repository without merging it. git merge The concept of git merging is basically to merge multiple sequences of commits, stored in multiple branches in a unified history. git pull merges combines git fetch and git merge it merges changes from a remote repository automatically
7. What is a merge conflict?A merge conflict is an event that occurs when Git is unable to automatically resolve differences in code between two commits. When all the changes in the code occur on different lines or in different files, Git will successfully merge commits without raising merge conflict.
8. How do you resolve a merge conflict?The easiest way to resolve a conflicted file is to open it and make any necessary changes
After editing the file, we can use the git add a command to stage the new merged content
The final step is to create a new commit with the help of the git commit command
Git will create a new merge commit to finalize the merge
