## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is an Open Source Distriubuted Version Control System. Software for which the original source code can be made freely available to be redistributed and modified, content tracker to be used to store content, maintains the history of what changes have happened by developers and has a remote version stored on a server and a local version strored on the developer's computer

2. What is the difference between Git and GitHub?
The difference between Git and GitHub is that Git is the set of commands that we will run in the terminal and GitHub is where we store all of our code that we manage with Git in the terminal. 

3. Why do we create a branch?
Branches are created to isolate an individuals work from the work of other team members.

4. What is the purpose of a Pull Request?
The purpose of a pull request is to let your team know that there are changes to review.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git push -u origin main

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
The differences and the function of each command is that `git fetch` is used to download contents from a remote repository, `git merge`brings the changes from one branch into another and `git pull` will push your changes to the default branch of the main or master.

7. What is a merge conflict?
From the text and video provided, there is nothing stating what a merge conflict is. In the guided project, the instructor states I most likely won't be merging in a job setting. Answering to the best of my ability quoting git-scm.com/docs/git-merge, it states a merge confilict is when changes made to the common ancestor's version, let's say by me, with the other side (someone else) left that area intact are incorporated in the final result as verbatim. So what I can make from this is that if two people make changes to the same area the merge conflict is requesting this to be resolved by leaving what both parties did to that area as "Git cannot randomly pick one side over the other."

8. How do you resolve a merge conflict?
As stated in my answer from number 7, I don't see anywhere where this is discussed but I tried to research this and will answer to the best of my ability. The resource on git-scm.com/docs/git-merge states to resolva a merge conflict, edit the files into shape (I have no clue what that means) `git add` them  to the index. Use `git commit` or `git merge --continue` to seal the deal. 
