## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
A free and open source distributed version control system for tracking changes in any set of files.
2. What is the difference between Git and GitHub?
GitHub is a code hosting platform for version control which utilizes git to store repositories, branches, commits, and pull requests.
3. Why do we create a branch?
Branching lets you have different versions of a repository at one time. This is helpful when you want to add new features to a project without changing the main source of code before QA testing and code reviews.
4. What is the purpose of a Pull Request?
To propose changes to the main branch and allow others to review your code before being merged into the main branch. PRs easily show diffs aka changes, additions, and subtractions between the branch and the main branch.
5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout
6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch downloads commits, files, and refs from a remote repository into your local repo but doesn't force you to merge the changes into your repo
git merge combines sequences of commits into one unified history of commits aka it takes changes from one branch and merges them into another branch
git pull will download the remote content for the active local branch and immediately execute git merge to create a merge commit for the new remote content
7. What is a merge conflict?
If the two branches being merged both changes the same part of the same file, Git won't be able to figure out which version to use and git presents the conflict with visual indicators to be resolved by a human.
8. How do you resolve a merge conflict?
Identify the conflicting sections in the merge and keep or delete the code from the conflicted content from the receiving branch or merging branch.