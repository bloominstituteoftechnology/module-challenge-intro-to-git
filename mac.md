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


----RESPONSES----

1. Git is a version control system that allows us to store code safely, track 
any changes in any files, and can be used when you have to collaboratively 
work with others.

2. Git is an actual command language we can use in terminal. Githib is the 
cloud that holds our repositories. 

3. We do branching because it allows individuals to split a code, make a copy 
of the code and make any edits/changes which can then be merged back to the 
main code. Helps with collaborative work. 

4. Pull requests allows you to pull the changes that you made in your terminal 
code to be "uploaded" to the show the change reflected in github. We can use 
this to submit our branches of work which will then be merged by 
supervisor/teacher or whoever is to review the code. 

5. 
The easiest way to switch branch on Git is to use the “git checkout” command and specify the name of the branch you want to switch to.
A quick way of switching branch on Git is to use the “git switch” command and specify the name of the branch you want to switch to. 

6.git fetch just "downloads" the changes from the remote to your local repository. git pull downloads the changes and merges them into your current branch.Git merge will combine multiple sequences 
of commits into one unified history.

7.Merge conflicts happen when you merge branches that have competing commits, and Git needs your help to decide which changes to incorporate in the final merge. Git can often resolve differences 
between branches and merge them automatically.

8. If your merge conflict is caused by competing line changes, such as when people make different changes to the same line of the same file on different branches in your Git repository, you can 
resolve it on GitHub using the conflict editor. 

For all other types of merge conflicts, you must resolve the merge conflict in a local clone of the repository and push the change to your branch on GitHub. You can use the command line or a tool 
like GitHub Desktop to push the change. 

If you have a merge conflict on the command line, you cannot push your local changes to GitHub until you resolve the merge conflict locally on your computer. If you try merging branches on the 
command line that have a merge conflict, you'll get an error message.
