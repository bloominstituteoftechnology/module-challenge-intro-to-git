## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
A Git is a verison control system that keeps tracks of all the changes made to files in a directory on your computer.
2. What is the difference between Git and GitHub?
Git is open source projects in a control system you can manage/keep track of your cource code history while GitHub is used to manage your Git repositiories better and is an cloud-based hosting service.
3. Why do we create a branch? 
We create branches so that multiple individuals can would on a code/project without having to re-create it yourself. Changes can kept track of and be made on each persons individual one without making changes on the original. 
4. What is the purpose of a Pull Request?
The purpose of a pull request is to let others know of the changes you've pushed into the branch in the repository on GitHub for them to review.
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
Git pull refers to when you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date. See also fetch.
Git fetch adds the changes from the remote repository to your local branch without committing them which allows you to review changes before committing them into your branch. Git merging however, takes the changes from one branch in a repository/fork and applies it to the other one merging them together.
Git pull is when you are fetching in the changes and then merging them so you can have yours up to date.
7. What is a merge conflict?
Merge conflicts happen when people make different changes to the same line of the same file, or when one person edits a file and another person deletes the same file.
8. How do you resolve a merge conflict?
Pull requests
