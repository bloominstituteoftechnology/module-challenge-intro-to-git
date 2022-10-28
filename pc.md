## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en). Docs (short for documentation) are the instructions on how to use a languge or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your Google skills!

1. What is Git? 
Git is the command system we use for everything. Bloomtech Sprint One, Module One, Objective One explains, "Git is an Open Source Distributed Version Control System."

2. What is the difference between Git and GitHub?
Git is the command system (I use a PC, so I use a "local" version of Git in the command terminal on my desktop computer through Git Bash) and Github is the online storage system, which empowers programmers to collaborate in teams based on forks.

3. Why do we create a branch?
Branches are extremely useful: they allow teams to work together, they allow thousands of programmers to individually isolate and improve separate features of a shared project, and they offer "version control" which prevents the original code from being lost if there's a problem with the update. Branches allow you to clone, then modify and tinker with the original code, without ruining the functional original version.

4. What is the purpose of a Pull Request?
In a real-life work environment, a subordinate programmer submits a Pull Request to get approval from the senior programmers, to compare and then approve an Update. Pull Requests are designed to prevent flawed code from being implemented live on a large scale, although this still happens (but fortunately, Pull Requests significantly reduce the frequency of these kinds of mistakes, or catastrophes.)

5. What is the command you can use to switch between branches? For example you are working on the FIRSTNAME-LASTNAME branch and you want to switch back to main.

"cd" is the command to change directories.

6. Explain the difference between `git fetch`, `git merge` and `git pull`. What does each command do?

These definitions are taken from "https://git-scm.com/docs/giteveryday"

Git fetch — "from "origin" to keep up-to-date with the upstream."
Git merge — "to merge between local branches."
Git pull — "fetches from origin by default and merges into the current branch."

But in my own words, much of this (Sprint One, Module One) tutorial has been aimed at teaching students (such as myself) how to do a very basic and pivotal task, which is to master the interfaces of Git and Github, and to become comfortable with working inside the CLI (command-line interface, which is Gitbash for me on Windows) and sending finished work from my desktop onto a shared Github repository, or to perform the reverse operation and take the Github repository down onto my local desktop. 

Sending work from local to remote, and from remote to local, are both crucial skills for any programmer. 

7. What is a merge conflict?
Merging conflicts occur when the update is incompatible with the original. I experienced a Merge Conflict this week, because I accidentally had created a Pull Request that was one commit ahead of the main branch, and two commits behind — this took me a couple hours to meticulously retrace my steps and figure out the typos I had executed. But it was a learning experience, and I felt quite triumphant after I figured out how to solve this (self-inflicted) problem on my own.

8. How do you resolve a merge conflict? 

Merge conflicts are quite frustrating. 

In my case, I deleted the problem files and retraced all steps from the beginning of the tutorial.

There are numerous ways to resolve a merge conflict; it can be done manually (usually a bad idea), but one good way is to do "git clone" of the original Github repository, make limited changes, and then resubmit. 

Clarity is the best remedy; the main problem here is being confused. 