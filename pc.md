## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
2. What is the difference between Git and GitHub?
3. Why do we create a branch?
4. What is the purpose of a Pull Request?
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
7. What is a merge conflict?
8. How do you resolve a merge conflict?

1. At the heart of GitHub is an open source version control system (VCS) called Git. Git is responsible for everything GitHub-related that happens locally on your computer.
2. Git is a version control system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that lets you manage Git repositories.
3. so that when the file is pulled and updated the changes happen to the local file before being pushed to the main file. This prevents mistakes from being directly pushed to the main branch.
4. this allows for the changes made to be reviewed and compared to the original.
5. git branch -m main
6. git fetch  Download objects and refs from another repository, git merge will Join two or more development histories together, git pull willFetch from and integrate with another repository or a local branch.
7.  When both sides made changes to the same area, however, Git cannot randomly pick one side over the other, and asks you to resolve it by leaving what both sides did to that area.
8.  Edit the files into shape and git add them to the index. Use git commit or git merge --continue to seal the deal. The latter command checks whether there is a (interrupted) merge in progress before calling git commit.