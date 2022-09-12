## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? Git is an open source version control system used for tracking changes in computer files. It can 
be used to store any type of content/file. 
2. What is the difference between Git and GitHub? Github is a cloud based hosting service that lets you manage 
Git repositories. Git is a version control system that lets you manage and keep track of your source code 
history.
 3. Why do we create a branch? We branch to isolate our work from other team members. It allows you to compare 
your code/changes you've made to the original.  
4. What is the purpose of a Pull Request? It is used to update the local version of a repository from a remote. 
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
the command would be 'git swtich' "name of branch you want to switch to"
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? 
git pull- command used to update the local version of a repository from a remote.
git merge- merging is gits way of putting a forked history back together again. This command lets you take the independant lines of development created by 
the git branch and integrate them into a single branch. 
git fetch- command that tells the local repository that there are changes available in the remote repository without bringing the changes into the local 
repository. (checking to see if there are changes available, yet doesnt do any file transferring)
7. What is a merge conflict?
event that takes place when git is unable to automatically resolve differences in code between two commits. This can happen when two seperate branches 
have made edits to the same line in a file, or when a file has been deleted in one branch but edited in the other. 
8. How do you resolve a merge conflict?
open the conflicted file and edit, after editing we can use the git add command to stage the new merged content, then we create a new commit using the git 
commit command.

