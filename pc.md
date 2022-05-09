## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? - Git is a version control system which stores content you create on your local system, to easily collaborate with others and upload all their changes.
2. What is the difference between Git and GitHub? - GitHub is a company with a cloud-based git service that hosts all your code on it, and is also open source. Git itself, is a dev tool to manage code.
3. Why do we create a branch? - Branches are esentially a copy of code that you can edit without touching the 'main branch' of code that you can make changes too. 
4. What is the purpose of a Pull Request? - A pull request is when you want to merge new code changes made from a branch of the main project back into it to combine the two.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main. - To switch back into the main branch, you would use `git checkout branch_name` and swap to whatever branch you would like.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? - `git fetch` downloads all changes from a certain remote, but does not intergrate it into the head branch. `git merge` merges the selected branch into the current head. `git pull` downloads any changes made and intergrates it into the head.
7. What is a merge conflict? - A merge conflict is when git is unable to resolve certain differences in code between two commits, typically on the same line. 
8. How do you resolve a merge conflict? - To resolve a commit, simple just use the `git status` command to find out where the conflict is occuring, and edit the line of code to fix whatever issue is presented. 
