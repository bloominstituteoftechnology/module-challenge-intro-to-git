## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a distributed version control system. It keeps track of all the 
changes made to files in a directory on your computer.

2. What is the difference between Git and GitHub?
The difference between Git and GitHub is that Git is a distributed version 
control tool that can manage a development project's source code history, 
while GitHub is used for storing, tracking, and collaborating on software 
projects.

3. Why do we create a branch? 
When you want to add a new feature or fix a bug you want to create a new 
branch to isolate your changes. This makes it harder for unstble code to 
get merged. It also gives the developer the chance to clean up their 
future's history before merging it into the main branch.

4. What is the purpose of a Pull Request?
Pull requests let you tell others about changes you've pushed to a branch 
in a repository. Once a pull request is opened, you can discuss and review 
the potential changes with collaborators and add follow-up commits before 
your changes are merged into the base branch.

5. What is the command you can use to switch between branches? For example 
you are working on FIRSTNAME-LASTNAME branch and you want to switch back 
to main.
Git checkout -b

6. Explain the difference between `git fetch`, `git merge` and `git pull`. 
What does each command do?
git fetch:When you use git fetch, you're adding changes from the remote 
repository to your local working branch without committing them. 

git merge: The git merge command lets you take the independent lines of 
development created by git branch and integrate them into a single branch.

git pull: Pull refers to when you are adding in changes and merging them. 
For instance, if someone has edited the remote file you're both working 
on, you'll want to pull in those changes to your local copy so that it's 
up to date.

7. What is a merge conflict?
A difference that occurs between merged branches. Merge conflicts happen 
when people make different changes to the same line of the same file, or 
when one person edits a file and another person deletes the same file. The 
merge conflict must be resolved before you can merge the branches.

8. How do you resolve a merge conflict?
To resolve a merge conflict caused by competing line changes, you must 
choose which changes to incorporate from the different branches in a new 
commit.

