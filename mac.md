## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
2. What is the difference between Git and GitHub?
3. Why do we create a branch? 
4. What is the purpose of a Pull Request?
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
7. What is a merge conflict?
8. How do you resolve a merge conflict?

1. Git is a version control system. A version control system allows you to see the progresson of a project. It also allows one to work collabrotively with other coders. It also has a safety measure built into it through server backups.
2. Github is a cloud platform that acts a server facility.
3. A branch isolates development work without affecting other branches in the repository, so one could essentially fix a bug or develop new features safely.
4. Pull requests let you tell others about changes you've pushed to a branch in a repository on github. 
5. $ git checkout <existing branch> // $ git checkout -b <new_branch> // $ git switch <existing_branch> // git switch -c <non_existing_branch>
6. git fetch downloads all of the required commits and files from the other repository. Git pull is used to fetch and download content from a remote repository and immediately update the local respository to match the content. This later point of git pull is the differentiator between pull and fetch. Fetch does not update local repo's working state. Git Merge is the command that lets you take the independent lines of development creates by a git branch and integrate them into a single branch (something git pull automatically executes) 
7. When 2 developers are trying to edit the same content.
8. Find the merge conflict in the repo, use a text editor, and delete conflict markers and decide which changes to keep. then: git add . and git commit -m "text".
