## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
Git is a Version control system that allows you to keep track of changes, edit in parallel and rollback.

2. What is the difference between Git and GitHub?
Github is the say warehouse that stores Git versions.

3. Why do we create a branch?
We create branches to work on a copy of the files in withou out affecting the original and allow us to merge back in once changes are agreed upon.

4. What is the purpose of a Pull Request?
After compareing your branch changes to the main branch (or the branch you intend to merge to), a pull request allows other participtes to review your contributions, make suggestions, and approve/or deny the adaptation/inclusion of your changes.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
$git checkout main ##replace main with name of branch to switch to

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch grabs list of all contents of a remote repository
git merge combines your a branch with another target branch 
git pull is a git fetch and updates your local repository with the latest contents (say someone else is working on the same branch as you and had pushed some changes, now you have them, and are working with it)

7. What is a merge conflict?
A merge conflict occurs when attempting you combine your changes to a target branch but your changes are in the same lines that someone else has tried to change, or the state of something you wanted to change is different than the version you have.

8. How do you resolve a merge conflict?
You compare the different changes up for consideration and pick one or the other (or write new code to compromise) then create new commit with those cahnges OR you can rebase your branch with the latest the remote branch has (which inclides the code that your changes conflict with) then attempt to merge your changes to that.
