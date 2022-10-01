## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. 
You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. 
A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. 
If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?

Git is software that, much like the Windows Terminal, allows users to code, create files, folders, and so on. Essentially an in depth version of Windows Explorer.

2. What is the difference between Git and GitHub?

GitHub allows users to store their code onto the cloud. Git is where users code. 

3. Why do we create a branch?

To identify one user from another, and to essentially organize seperate versions of the same code. 

4. What is the purpose of a Pull Request?

The purpose of a pull request is to add a user's branch to the main code. The process is essential for bug fixing. 

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.

git checkout "main"

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?

'git fetch' downloads commits from other repositories.
'git merge' joins two commits into one.
'git pull' updates current commit to newer ones. 

The difference between 'git fetch' and 'git pull' is that 'git pull' allows you to update your current commit, 
while 'git fetch' downloads new ones for you, like from a serperate branch.
Lastly, 'git merge' would only allow you to update a commit that you used 'git fetch' to download. 

7. What is a merge conflict?

A merge conflict is when two commits are conflicting into the same branch.

8. How do you resolve a merge conflict?

Either by using the conflict editor on GitHub, or using 'git pull' then adding new changes to the previously 
conflicting repository locally, then using 'git push' to submit them. If two users are fixing the same line of code, 
or the same bug, whichever user was last to push their commit will have a merge conflict. 

Hello world! 
