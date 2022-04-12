## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
is software for tracking changes in any set of files, usually used for coordinating work among programmers collaboratively developing source code during software development.

2. What is the difference between Git and GitHub?
The key difference between Git and GitHub is that Git is an open-source tool developers install locally to manage source code, while GitHub is an online service to which developers who use Git can connect and upload or download resources.

3. Why do we create a branch?
Creating a new branch allows you to isolate your changes from the master branch. If your experimentation goes well you always have the option to merge your changes into the master branch. If things don't go so well you can always discard the branch or keep it within your local repository.

4. What is the purpose of a Pull Request?
A pull requests is a mechanism for a developer to notify team members that a feature or fix, developed on a separate branch, is ready. This lets everybody involved know that they can review the code, providing a forum discussing the implementation of the proposed feature.

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
Switching branches is something you'll need to do often in Git. To do this, you can use the git checkout command.

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch is similar to pull but doesn't merge. i.e. it fetches remote updates ( refs and objects ) but your local stays the same (i.e. origin/master gets updated but master stays the same) . git pull pulls down from a remote and instantly merges. git clone clones a repo.

7. What is a merge conflict?
A merge conflict is an event that takes place when Git is unable to automatically resolve differences in code between two commits. Git can merge the changes automatically only if the commits are on different lines or branches

8. How do you resolve a merge conflict?
The easiest way to resolve a conflicted file is to open it and make any necessary changes.
After editing the file, we can use the git add a command to stage the new merged content.
The final step is to create a new commit with the help of the git commit command.
