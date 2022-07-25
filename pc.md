## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
	the version control system developers can use when they create something to make various changes to code.
	Git keeps these revisions orderly by storing changes in a repository allowing collaboration among devs.
2. What is the difference between Git and GitHub?
	Git is the version control system enabling managment and tracking of source code history.
	Github is the cloud-based service that enables managment of Git repos. 
3. Why do we create a branch?
	Branches are independent lines of development and isolate your work from other team members. 
4. What is the purpose of a Pull Request?
	updates the current local working branch and updates the remote-tracking branches for all other branches
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
	git switch "name-of-branch"
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
	git fetch = download objects and refs from another repo / git merge = joining two or more development histories together / git pull = fetch and integreate with another repo
	or local branch
7. What is a merge conflict?
	when Git isnt able to automatically fix differences in code between two commits
8. How do you resolve a merge conflict?
	make necessary changes
	git diff ( helps id the differences between the repos or files )
	git log --merge (produces list of commits that are conflicting )
	git checkout (undo the changes made to the file, or for changing branches)
