## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is a Open Source Distribution Version Control System. Meaning, it is software with a open source code that allows for content tracking / storing of any files types. A simple way to discribe it is like a community garden that keeps track of all things planted. How it was, where it was, who it was, what was, etc etc.  

2. What is the difference between Git and GitHub?
Git is locally installed tool. Github is a SaSS that you can connect Git to. 

3. Why do we create a branch?
So we can isolate our work from others, while still being able to merge with other branhes within the same repo.

4. What is the purpose of a Pull Request?
To notify that a change, feature or fix that you pushed to a branch in a repo is ready for review, discussion, and feedback before it is merged.  

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout ot git switch

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
`git fetch` will download the remote content from a branch or repo but will not update or change the local content or change the working state of the repo.
`git merge` combines branches. The current branch gets updated while "target" branch is left untouched. It looks for common base commit, once it has that it will create a new one that combines them. 
`git pull` will download the remote content and execute a merghe commit with the active local brnach. 

7. What is a merge conflict?
It is what happens when Git can not resolve the differences between two commits.

8. How do you resolve a merge conflict?
if you run the "get status" command Git will show you the files in conflict. You can also look for the visual indicators <<<<<<<, =======, and >>>>>>>. Once you have identified the conflicted files you can then address the issues. Once you have done that you can run the "get add" commmand on those files letting Git know the issues have been fixed and then run the "get commit" cmd to finish the merge.
