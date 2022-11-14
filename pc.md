## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
A: Version control System that is responceable for everything GitHub related.

2. What is the difference between Git and GitHub?
A: Git is a version control system, GitHub is a cloud based hosting service used to manage Git repositories.

3. Why do we create a branch?
A: Creating a new branch makes a spce for you to work without affecting the default branch. Also gives others a change to review any work or changes you added.

4. What is the purpose of a Pull Request?
A: This allows you to ask collaborators for feedback on your changes. It also requires aproval before a request can be merged and make any changes to the main branch.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
A: git checkout (new_branch)

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
A1: Git fetch - updates the local repository to the same state as the remote
A2:Git merge - allows you to take independent lines created by a git brance and merge them into a single branch.
A3:Git pull - allows you to fetch and download the content immediately and updates the local repository.

7. What is a merge conflict?
A: happens when you merge branches that have competing commits. Maybe two developers worked on the same line of code. 

8. How do you resolve a merge conflict?
A: 1: Under repository name click on a pull request with a merge conflict
   2: At the the bottom of the pull request, click Resove Conflicts
   3: Decide which brances changes you want to keep
   4: Once you resole the conflicts in the file click Mark as Resolved