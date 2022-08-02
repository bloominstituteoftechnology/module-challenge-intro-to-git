## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
	Git is a version control system: by keeping track of changes made to file repositories, Git allows multiple users to work safely and efficiently even on large projects.
2. What is the difference between Git and GitHub?
	Github offers remote storage and a web interface for Git repositories.
3. Why do we create a branch?
	Branches allow parallel development without effect on the main repository. 
4. What is the purpose of a Pull Request?
	The user initiates a Pull Request for a branch to allow others to discuss and review the proposed changes before merger with the main branch
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
	git checkout main
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
	'Git fetch' downloads all history from the remote tracking branches. 'Git merge' merges the remote branch with the current local branch. 'Git pull' updates the current local branch with commits from remote branch; it combines 'git fetch' and 'git merge'
7. What is a merge conflict?
	When branches with competing commits are merged, Git needs help to resolve the conflict. Common conflicts include multiple users editing the same line of the same file and a user deleting a file another had edited.
8. How do you resolve a merge conflict?
	If the conflict is caused by competing line changes, use GitHub's conflict editor. Other conflicts must be solved manually through text editors and the terminal.