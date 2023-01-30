## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.
2. What is the difference between Git and GitHub?
Git is a version control system that lets you manage and keep track of your source code history. GitHub is a cloud-based hosting service that lets you manage Git repositories
3. Why do we create a branch?
In Git, branches are a part of your everyday development process. Git branches are effectively a pointer to a snapshot of your changes. When you want to add a new feature or fix a bug—no matter how big or how small—you spawn a new branch to encapsulate your changes.
4. What is the purpose of a Pull Request?
Pull requests let you tell others about changes you've pushed to a branch in a repository on GitHub. Once a pull request is opened, you can discuss and review the potential changes with collaborators and add follow-up commits before your changes are merged into the base branch.
5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
To switch back to a firstname-lastname branch you can type git checkout firstname-lastname if branch already exists of course. to make sure your target branch exists you can type git branch and that should show all branches under the main.
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch is a primary command used to download contents from a remote repository. git merge is a command that lets you take the independent lines of development created by git branch and integrate them into a single branch. git pull is a command used to fetch and download content from a remote repository and immediately update the local repository to match that content. the difference between Git fetch and git pull  is git fetch fetches the changes while git pull merges them after fetching. So in a way, git fetch is a part of git pull as it first fetches the changes and then performs git merge.
git fetch updates your local repository with commits that have been added to the server since your last fetch, while git merge will try to combine two parallel development paths.
7. What is a merge conflict?
Merge conflicts happen when you merge branches that have competing commits, and Git needs your help to decide which changes to incorporate in the final merge. Git can often resolve differences between branches and merge them automatically.
8. How do you resolve a merge conflict?
Under your repository name, click Pull requests.
In the "Pull Requests" list, click the pull request with a merge conflict that you'd like to resolve.
Near the bottom of your pull request, click Resolve conflicts.
Decide if you want to keep only your branch's changes, keep only the other branch's changes, or make a brand new change, which may incorporate changes from both branches. Delete the conflict markers and make the changes you want in the final merge.
If you have more than one merge conflict in your file, scroll down to the next set of conflict markers and repeat steps four and five to resolve your merge conflict.
Once you've resolved all the conflicts in the file, click Mark as resolved.
If you have more than one file with a conflict, select the next file you want to edit on the left side of the page under "conflicting files" and repeat steps four through seven until you've resolved all of your pull request's merge conflicts. 
Once you've resolved all your merge conflicts, click Commit merge. This merges the entire base branch into your head branch. 
If prompted, review the branch that you are committing to.

If the head branch is the default branch of the repository, you can choose either to update this branch with the changes you made to resolve the conflict, or to create a new branch and use this as the head branch of the pull request. 
 If you choose to create a new branch, enter a name for the branch.

If the head branch of your pull request is protected you must create a new branch. You won't get the option to update the protected branch.

Click Create branch and update my pull request or I understand, continue updating BRANCH. The button text corresponds to the action you are performing.
To merge your pull request, click Merge pull request. 
