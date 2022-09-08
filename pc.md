## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency. Git is easy to learn and has a tiny footprint with lightning fast performance

2. What is the difference between Git and GitHub?
Git is a version control system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that lets you manage Git repositories. If you have open-source projects that use Git, then GitHub is designed to help you better manage them.


3. Why do we create a branch?
Branching allows each developer to branch out from the original code base and isolate their work from others.

4. What is the purpose of a Pull Request?
Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub. Once a pull request is opened, you can discuss and review the potential changes with collaborators and add follow-up commits before your changes are merged into the base branch.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git switch

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch fetches updates but does not merge them. git pull does a git fetch under the hood and then a merge . git fetch is similar to pull but doesn't merge. i.e. it fetches remote updates ( refs and objects ) but your local stays the same (i.e. origin/master gets updated but master stays the same) .


7. What is a merge conflict?
A merge conflict is an event that takes place when Git is unable to automatically resolve differences in code between two commits.

8. How do you resolve a merge conflict?
The easiest way to resolve a conflicted file is to open it and make any necessary changes.
After editing the file, we can use the git add a command to stage the new merged content.
The final step is to create a new commit with the help of the git commit command.

