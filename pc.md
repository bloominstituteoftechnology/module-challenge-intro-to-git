## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
2. What is the difference between Git and GitHub?
3. Why do we create a branch?
4. What is the purpose of a Pull Request?
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
7. What is a merge conflict?
8. How do you resolve a merge conflict?

1. Git is a command line tool used to manage multiple versions of edits in source code, which can be transferred to a Git repository.
2. GitHub is a website/app that you can upload and store copies of a Git repository, while git manages the versions of source code.
3. We create a branch to work on changes to a project without interfering with the original version of it.
4. A pull request allows you to compare changes to a file from different branches.
5. git checkout -b "name of branch"
6. 'git fetch' is used to update a local repository to the one that's remote,
   'git merge' is used to join two or more development histories together,
   'git pull' is to used to fetch and combine with another repository or a local branch
7. A merge conflict is when two different branches edited the same line of code and the merge cannot go through until the lines in the respective branches are changed.
8. You resolve a merge conflict by finding the conflict marker which looks like, <<<<<<< HEAD (1st edit) ======= (2nd edit)  >>>>>>> BRANCH-NAME. After that,
   you erase the conflict markers, type the changes you want and then stage changes and commit.
