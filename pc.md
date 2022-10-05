## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
Git is an open source distrubted version control system. Open source so the original source code is made freely available and can be redistributed and modified.

Control System is a content tracker so git can store content. Often code but can be writing, pictures or any file.

Version Control System is content stored in git that keeps changing as more content is added. Helps mantain a history of what changes happened.

Distributed Version Control System means git has a remote version on a server and local on the developer's compiter. Code is stored on a central server
and full copy present on the developer computer.

2. What is the difference between Git and GitHub?
Git is a version control system that lets you manage and keep track of your source code history. 
GitHub is a for-profit company that offers a cloud-based git hosting service. 

3. Why do we create a branch?
A branch is basically independent development.  You can take advantage of branching to work on code because it isolates your work frmom the other team members.

4. What is the purpose of a Pull Request?
The purpose of a pull request is to update the local version of a repository from a remote. Updates the current local branch.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout and or git checkout -b .

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch is a command that tells local repository that they are changes available in the remote repository without bringing changes into the local repository.
git pull brings the copy of the remote directory changes into the local repository. 
git merge will combine multiple sequences of commitss into one unifed history. In most cases is used to combine two branches.
 
7. What is a merge conflict?
A merge conflict happens when you merge branches that have competiting commits and git needs help to decide which changes are in the final merge.

8. How do you resolve a merge conflict?
Navigate into the local Git repository that has the merge conflict. Open the file that has the conflict. Decide which changes to the branches you're keeping
or deleting. Delete the conflict markers and make changes you want in the final merge. Use git add for the changes, then git commit -m  "".
