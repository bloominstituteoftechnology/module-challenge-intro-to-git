## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs] . Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a version control system that is used to manage and track changes to software code and other types of files. It was created by Linus Torvalds in 2005 and is now widely used by developers all over the world.
2. What is the difference between Git and GitHub?
Git is the software used for version control, while GitHub is a web-based platform that provides a centralized location for hosting Git repositories and additional collaboration tools. While they are often used together, they are distinct entities.
3. Why do we create a branch?
Creating a branch on GitHub allows developers to work on different features or changes to a project in isolation from the main codebase, without affecting the main codebase until their changes are ready to be merged.
4. What is the purpose of a Pull Request?
The purpose of a pull request on GitHub is to propose changes to a codebase and request that they be merged into the main codebase.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
To switch between branches in Git, you can use the git checkout command followed by the name of the branch you want to switch to
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
In summary, git fetch downloads the latest changes from the remote repository, git merge integrates changes from one branch into another, and git pull combines the functionality of git fetch and git merge into one command
7. What is a merge conflict?
A merge conflict occurs in Git when there are conflicting changes made to the same lines of code or files in different branches that are being merged together. This can happen when two or more developers are working on the same codebase, and they modify the same file or lines of code independently
8. How do you resolve a merge conflict?
Identify the files with merge conflicts. When you attempt to merge two branches and Git detects conflicts, it will display a message with the files that have conflicts. You can use the command git status to see the list of files with conflicts.

Open the conflicting files in a text editor. When you open the file, you'll see the conflicting changes, marked with <<<<<<<, =======, and >>>>>>> markers.

Choose which version of the code to keep. Review the changes made in each version of the code and decide which changes you want to keep.

Edit the file to resolve the conflicts. Remove the conflict markers <<<<<<<, =======, and >>>>>>> and manually edit the file to merge the changes from both branches. Save the changes.

Add the resolved files to the staging area. After you have edited the files and resolved the conflicts, you can use the git add command to add the resolved files to the staging area.

Commit the changes. After you have added the resolved files to the staging area, you can use the git commit command to commit the changes to the repository.

Repeat the process for each file with conflicts. If there are multiple files with conflicts, repeat the process for each file until all conflicts are resolved.

After you have resolved all conflicts, you can use the git merge command again to complete the merge process. If there are no more conflicts, the merge will be successful, and the changes from both branches will be merged into the current branch
