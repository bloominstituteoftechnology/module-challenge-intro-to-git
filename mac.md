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

1.git keeps track of changes made to files on your computer. It 
allows you to make changes while also keeping all former versions of 
the file.
2. git is a version control system for you and your source code 
present and past whereas github is a cloud service that allows you to 
manage git repositories.
3.we create a branch so that we dont mess with the main version of 
the repository. instead we work on a clone just in case the changes 
fail, then if they do end up being valid changes we can merge the 
changes back into the main branch.
4.pull requestes are used to look at both the main branch and 
others(while highlighting the changes made) before merging them back 
into one.
5. 'git checkout "name of banch"' to switch branches
6. git fetch updates the local repository but does not merge with the 
main. git pull does what git fetch does but goes even further and 
merges it with the main repository.git merge merges the branches or 
repositories back into one.
7. a merge conflict typically happens when for example 2 people 
change the same line of code in a file before merging or if one 
person deltes a file while another is modifying it.
8.ro resolve a merge conflict, just go into the file and make the 
necessary changes. after making the changes use git add and git 
commit to commit t he new changes before trying to merge again.
