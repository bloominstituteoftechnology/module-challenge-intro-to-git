## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is FOSS made for code management, it lets you or others work on the same codebase and have multiple branches and versions of the same project
2. What is the difference between Git and GitHub?
git is software, whereas github is microsoft's cloud repository that makes things more easily shareable
3. Why do we create a branch?
so we don't absolutely destory the main branch with buggy code. it's a good practice to seperate what you're working on from the main repo, so that you can compare the files later
4. What is the purpose of a Pull Request?
to show the changes you push to a branch in a repo
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git pull will try to automatically merge into your branch after fetching commits
git fetch gathers commits from your targeted branch and stores them in your local repo, it doesnt merge automatically
git merge uploads your commits into your current branch
7. What is a merge conflict?
when you merge branches that have competing commits
8. How do you resolve a merge conflict?
by manually editing the conflicting file by editing the code or the file itself before merging