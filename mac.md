
## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a version control system that allows developers and data scientists to track changes in their code, view progress they have made in their projects and revert to older versions of code. It also enables teams to easily collaborate as multiple people can work on the same file at the same time.
 
2. What is the difference between Git and GitHub?
Git is the software system used to do version control, manage and track the source code history. On the other hand, GitHub is a cloud hosting
platform that utilizes git repositories.

3. Why do we create a branch?
A branch is a copy or a version of the source code that works parallel to the main version. Developers create a branch to isolate their work from other teammates when doing their tasks without creating conflict in the code. Once the task is finished, the work can be merged into the base or main branch.   
 
4. What is the purpose of a Pull Request?
A pull request is telling others that proposed changes have been submitted to the repository, and the work is ready to be integrated into the main project.

5. What is the command you can use to switch between branches? For example, you are working on FIRSTNAME-LASTNAME branch, and you want to switch back to main. One way of switching between branches is using the command git checkout <branch-name>

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does 
each command do?
- git fetch downloads data from remote repositories without integrating it into the developer’s working files. This command is useful to see all the new things that happened in the remote repositories without changing or destroying their work.

- git pull automatically merges commits to the developer’s local directory from a remote repository. It means that the data from the remote repository integrates into their current working files.

- git merge is used when the developer is ready to incorporate the changes from the remote repository into his local repository.


7. What is a merge conflict?
A merge conflict happens when git can’t automatically execute the merge. This typically happens when two developers edit the same line of code or if one editor removes a file and the other makes changes to that file.

8. How do you resolve a merge conflict?
To resolve the conflict, the developer must decide which of the changes they would like to accept. It can be done through the terminal or through most modern text editors. Once the developer makes the choice, they will have to recommit their branch.
