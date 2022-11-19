## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?

Git is a fast, scalable, distributed revision control system with an unusually rich command set that provides both high-level operations and full access to internals.

2. What is the difference between Git and GitHub?

Git is software, while GitHub is a service. Git is also a command line and GitHub is a graphical tool. Git is locally installed on your system, and GitHub is hosted on the web.Git is maintained by Linux while GitHub is maintained by Microsoft. Git is focused on version control and code sharing, and GitHub is focused on centralized source-code hosting. Git is a version control system to manage source-code history. Github is a hosting service for Git repositories.

3. Why do we create a branch?

We create branches so that we can work on source-code and files in a way that when they are modified, they are not changed in the main branch until those changes are approved by the team.

4. What is the purpose of a Pull Request?

A pull request allows you to compare differences between files, and check your changes. It also lets you tell others about those changes before a merge is performed.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.

git checkout main_branch

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
The difference between git fetch, git merge, and git pull, is that fetch, work in conjunction with other commands like merge. Merge is not a primary command like fetch. Fetch and pull pulldown the contents of a repository in different ways. fetch tells the local repository that the remote repository has changed, without bringing the changes into the local repository. git pull copies down the remote directiroy changes into the local repository.

git fetch is a primary command used to download the contents from a remote repository.

git merge takes the independent lines of source-code created by git branch and integrates them into a single branch.

git pull is used to fetch and download content from a remote repository and immediately update the local repository to match that content.

7. What is a merge conflict?

Merge conflicts occur when competing changes are made to the same line of a file, or when one person edits a file and another person deletes the same file.

8. How do you resolve a merge conflict?

You can use the conflict editor to resolve competing line changes between branches that are part of a pull request. Resolving conflicts causes a merge to occur between the base and head branches.
