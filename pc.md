## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
	Git is an open source program for tracking changes in text files.
2. What is the difference between Git and GitHub?
	Git is a system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that lets you manage Git repositories.
3. Why do we create a branch?
	To create a safe space to make changes. If a mistake is made, the original default branch is not affected.
4. What is the purpose of a Pull Request?
	To ask collaborators for feedback or advice on changes before they are completed.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
	$ git switch -c [branch-name]
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
	'git fetch' downloads all history from branches. 'git merge' combines branches into current local branch. 'git pull' updates current local branch with all new commits.
7. What is a merge conflict?
	When Git is unable to automatically resolve differences in code between two commits.
8. How do you resolve a merge conflict?
	By opening and making any necessary changes before creating and commiting a new  merge.
