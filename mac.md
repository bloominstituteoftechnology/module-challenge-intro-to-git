## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a version control software bringing simplicty to soft engineering 
teamwork.
2. What is the difference between Git and GitHub?
 git a software that allows your source code history to be tracked (i have no 
idea what that means... Doesnt GitHub keep track of all the changes and 
differences made when a team is progressing code?) and GitHub creates 
repositories to be made, drawn from, code to be pushed to, etc. in order to help 
ensure everyone working on the project has the most up-to-date code. This allows 
more efficiency because we dont use email.
3. Why do we create a branch? 
branches highlight, and help keep track, changes a single developer is 
working on. Rather than writing it with the main code base which, i think, would 
make things confusing.... not really sure
4. What is the purpose of a Pull Request?
a pull request shows everyone within the team the changes i have made to the 
main code. Once the pull request has been reviewed, then we can merge them to 
progress the main code further into the future.
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git switch is the command one would use to switch between different branches.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch checks to see if there is any new files within the main whereas git 
pull checks for files, but copies everything to your local repository for 
editing. git merge will combine one's local repository with the main repo. it is 
important to use a pull request prior to merging in order to maintain DRY code.
7. What is a merge conflict?
a merge conflict will arise when two changes cannot live together. for 
example, if i edit a file, but a compatriot deletes the file, GitHub will have 
conflicts about what to do... if there are two possibilities and no clear path 
to resolve, the team must resolve the merge conflict prior to proceeding.
8. How do you resolve a merge conflict?
depending on the issue to resolve a merge conflict with the example above, 
the decision to keep the file needs to be made. one must chose which pull 
request to allow to be merged with the main. once a decision is made and the 
proper changes (if needed to certain files) have been made, a merge can take 
place. 
