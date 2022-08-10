## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? Git is an Open Source Distributed Version Control System which allows developers to work on code and contribute to code simultaneously. 

2. What is the difference between Git and GitHub? Git is the software in which developers edit code, whereas Github is the cloud platform in which the code is stored in order to allow access to other developers and allow collaborative work.

3. Why do we create a branch? We create branches in order to allow us to isolate or work from team members to fix bugs or adding new features and then later merging back in to one branch. Allows for collaborative, simultaneous work.

4. What is the purpose of a Pull Request? While git Push updates the remote repository based on the changes made in the local repository, git Pull updates the local repository based on changes made to the remote repository.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main. The command would be $ cd ..

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do? The command 'git fetch' determines whether or not there have been any changes made to a remote repository that differ from your local repository. 'Git merge' will then take any established changes from your 'git fetch' command and combine them with your local repository. Alternately 'git pull' establishes whether or not there are any changes/differences and brings them in to your local repository branch.

7. What is a merge conflict? A merge conflict is one that arises due to two people making an edit to the same line or same files of information on two different local repositories. 

8. How do you resolve a merge conflict? These must be corrected within Github. You must first ensure that you pull the most recent version of the repository and check out the souttce branch. You then want to pull the destination branch in to the source branch to identify the errors and discrepancies. You cna then correct the identified errors and the commit the change and push it to the remote repository. This is why it is important to make lots of branches so that you ensure you are constantly pulling the most updated information.
