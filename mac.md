## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?

	Git is a system for code management used to track code and the changes in it 
	allowing multiple users to work on the same project.

2. What is the difference between Git and GitHub?

	While Git is a system to track and manage you codes history, GitHub is a web-based service 
	that allows you to share projects and code. (GitHub uses Git)

3. Why do we create a branch? 

	We create a branch to make changes and tweaks to a file of code without directly affecting 
	it until we create a pull request to merge our branch with the main branch.

4. What is the purpose of a Pull Request?

	The purpose of a Pull Request is to get our branch of code into the main branch of 
	code. 

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.

	You would use the command "git branch -M main"

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?

	Git fetch will pretty much just show you that there are changes without integrating into 
	your code.
	Git merge will merge two branches of code into one branch.
	Git pull will fetch the content and merge the content into the repository. 
	They all work with getting new content into your code but all do different things.

7. What is a merge conflict?

	A merge conflict is what happens when trying to merge two different 
	branches of code that have the same lines modified together. 

8. How do you resolve a merge conflict?

	You can resolve a merge conflict by modifying the lines by rearranging them or deleting the 
	lines that are causing the conflict depending on the scenario. Then continue to git add, 
	and git commit.
