## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
   - Git is a software for tracking all commits and changes.

2. What is the difference between Git and GitHub?
   - Git is a tracking tool, GitHub is a place to save, share & collaborate repositories. 

3. Why do we create a branch? 
   - We create a branch to upload any changes into our forked repository & not use the original repository. 

4. What is the purpose of a Pull Request?
   - The purpose of a Pull Request is to obtain the latest changes & commits from the repository into the obtainer's local repository.

5. What is the command you can use to switch between branches? For example you are working on firstName-lastName branch and you want to switch back to main.
   - The command used to switch branches is `git checkout -b firstName-lastName`. 

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
   - `git fetch` & `git pull` have a lot of similarities but defer from each other. `git fetch` does not merge the repository onto the local, while the other method does. `git merge` merges all new changes from a repository into the local repository.

7. What is a merge conflict?
   - A merge conflict is when Git is unable to fix a situation between multiple commits. This can happen when the changes from the commit are unidentifiable and Git does not know which code to discard & which to keep.

8. How do you resolve a merge conflict?
   - To resolve a merge conflict is to `git add .` and make any new changes than `git push` to upload all new changes and commits to the repository. 