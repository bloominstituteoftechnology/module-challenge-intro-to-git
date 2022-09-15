## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is an Open Source Distributed Version Control System.
2. What is the difference between Git and GitHub? 
Git is a open source distributed version control system,aka a git is a content tracker,while github is a company that offers a cloud-based git hosting service; meaning th at it holds a bunch of repositories full of source code.
3. Why do we create a branch?
so we can compare from the main branch and incase something breaks we can go back and view the orgin.
4. What is the purpose of a Pull Request? 
to have it viewed by others for a proofing.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout -m <branch-name>
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? Git fetch is the command that tells your local git to retrieve the latest meta-data info from the original. Git merge combines serveral sequences of commits into a single history(in most cases that means merging two branches). Git pull command is used to fetch and download content from a remote repository and immediately update the local repository to match that content.The difference between them is that git fetch is like just checking to see if there has been any updates, while git pull is checking and updating if possible immediately; git merge is taking the two different and integrate them into one.
7. What is a merge conflict? is an event that takes place whjen git is unable to automatically rtesolve the differences in code between two commits.
8. How do you resolve a merge conflict?
you pull the changes to your local repository and fix them there.
