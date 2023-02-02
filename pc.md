## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
`Git is a DevOPS tool used for storing code remotely on the cloud, keep track of any changes made to code, and also to collaborate with other developers with or on the same skills level with ease.`





2. What is the difference between Git and GitHub?
`While Git is a tool used for storing code, checking code, and or sharing code. Github is a place where you can store the code for others to download, use, play, or develop with you and is a good place for people to check if there is any changes made to the main branch of code if you are in a setting with one or more developers other than yourself.`





3. Why do we create a branch?
`We create our own branch so it's not getting directly uploaded to the main branch as soon as we make changes, because you don't know if it's going to cause any problems if you upload it. If someone was to download the main branch while you were on it and you messed something up, they don't know that and when they download that code everything could stop working and they could think that it's either their code or something happened to it previously. That's why it's best to make your own branch and if you have a team lead or anything like that have them check it over and get their approval to move it over to the main branch so others can use your approved and correct code, and get that up to date.`



4. What is the purpose of a Pull Request?
`One purpose of a pull request is to see what you changed to what was fixed in your code over the previous one. So say you have a bug on the main branch that nobody can fix except you so you create your own branch, get it approved. You can submit a pull request and when someone looks over it, they can see what you removed and what you added. If that code is correct, the team lead can also merge it into the main branch so everyone can see what changes where made and can look it over if it ever happens again.`





5. What is the command you can use to switch between branches? 
You can use two commands, you can use

`git checkout -b (BRANCHNAME)`

Or if you want to switch back to main you can do

`git switch main`

to swap to the main branch or whichever branch you desire.


For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.

You can use the git command

`git switch main`






6. Explain the difference between `git fetch`, `git merge` and `git pull`. Fetches and integrates from another repo or local branch

`git fetch` Downloads files/folders of code from another repo

`git merge` Joins two or more development histories together

`git pull`  




7. What is a merge conflict?

`Merge conflicts often happen when a branch that you merge has one or more competing commits.`








8. How do you resolve a merge conflict?

You can use a few commands to resolve a git conflict such as

`git merge --abort` This command helps exiting while you are merging branches so you can bring it back to normal.

`git reset` This command resets the conflitcted files to the state they were before they were altered.









