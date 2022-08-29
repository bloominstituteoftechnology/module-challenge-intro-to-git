## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
    Git is a version control system. It is used to help manage coding projects, particularly with multiple people working on the same project.
2. What is the difference between Git and GitHub?
    Github is a site that that allows us to readily use git for our projects.
3. Why do we create a branch?  
    We create a branch to allow us to make changes/updates/edits in a manner that allows us to see the steps that have been made. It also allows for several people to work on their own changes to the base respository without issues between each other.
4. What is the purpose of a Pull Request?
    A pull request is used to send in code changes to be reviewed and if done well, to be merged into the code for the project as a whole.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
    git switch main
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
    git fetch lets you download something from another repository. git merge lets you join or merge commits between different branches. git pull is in a sense fetching and merging your commits with another repository, such as local commits to a remote one.
7. What is a merge conflict?
    A merge conflict is if a file or line of code that you are wnating to change has already been changed by another contributor.
8. How do you resolve a merge conflict?
    You identify what conflicts there are, you can use git status to help with this. You then need to decide which of the changes to use for a commit going forward. You open the file in question and get rid of conflict markers, and then have any changes that you want to be used for the new commit. Commit the changes, add appropriate comments to know what you did (and especially to let others know).