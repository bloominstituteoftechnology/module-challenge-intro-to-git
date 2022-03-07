## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?

Git is a DevOps tool used for source code management. It is a free and open-source version control system used to handle small to very large projects efficiently. Git is used to tracking changes in the source code, enabling multiple developers to work together on non-linear development.

2. What is the difference between Git and GitHub?

Since they are so closely related, it would make sense if git and GitHub were owned by the same company. On the contrary, git is open source software, while GitHub is owned by Microsoft. Open source platforms – including git and WordPress – are free to use, modify, and distribute. GitHub’s pricing model is different, but it provides an interesting free plan.

3. Why do we create a branch? 

So we may work on our own forked copy without changing the original so we may share our work with others on the team.

4. What is the purpose of a Pull Request?

Pull requests tells others that you've made changes to the repository and that they can now open discussion about the changes made.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.

git checkout

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?

git fetch is used to extract information of last updated commits, included branches and files from its remote repository with its related objects. 

git merge is used to integrate changes from another branch. 

git pull is used to fetch and download content from a remote repository and immediately update the local repository to match that content.

7. What is a merge conflict?

Merge conflict occurs when your changes conflict (will need to overwrite what is on the remote repository, name it master or the branch where you pushing your changes onto) with another person of your team's changes (his changes since last time you pulled would overwrite your changes that you are trying to push, or you will overwrite his changes).

8. How do you resolve a merge conflict?

Avoid adding changes at the end of the file.
Push and pull changes as often as possible.

