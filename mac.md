## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git?
Git is version conrtol system.

2. What is the difference between Git and GitHub?
Git is the tool used to manage multiple versions of source control code edits that are then transferred to files in a git repository. Github seves as a location for uploading copies of a git repository.

3. Why do we create a branch?
To isolate changes from the master branch.

4. What is the purpose of a Pull Request?
To let you tell others about changes you've pushed to a branch in a repository on GitHub.

5. What is the command you can use to switch between branches? For example you are working on FIRSTNAME-LASTNAME branch and you want to switch back to main.
git checkout main 

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?
git fetch fetches updates but does not merge them. git merge is executed 
to merge the remote content refs and heads into a new local merge commit. 
git pull first runs git fetch which downloads content from the specified remote 
repository.

7. What is a merge conflict?
an event that takes place when Git is unable to automatically resolve 
differences in code between two commits. 

8. How do you resolve a merge conflict?
git log --merge to produce the lists of commits that are causing the 
conflict. Open the file and make any necessary changes.
Use the git add a command to stage the new merged content.
create a new commit with the help of the git commit command.
Git will create a new merge commit to finalize the merge.
