# Git for Web Development Project

In this project you will be using the concepts learned in the Git for Web Development lesson to fork/clone/push/and submit a PR for each project during this sprint.

This project consists of two parts:

## Part One:

You will need to follow the Lambda School Git Workflow to add a file to this project follow the steps below:

- [x] Create your own version of this repo - Fork
- [x] Add your TL as a collaborator
- [x] Clone this repo
- [x] Create a branch `git checkout -b 'firstName-lastName'`
  - [x] Add a file to the project called `yourFirstName-yourLastName`.txt. This file can contain anything.
  - [x] Run your usual git commands for adding/commiting and pushing **Be sure to push to your branch!**
- [x] Create a Pull-Request to submit your work
  - [x] Use your own student fork as the base (compare across forks, base-fork -> master).
  - [x] Add your TL as a reviewer on the Pull-Request
- [x] TL then will count the Assignment as done by merging the HW back into master "STUDENT FORK".

## Part Two:

Go back and follow the same steps for your [UI-III-Flexbox project](https://github.com/LambdaSchool/UI-III-Flexbox) and your [User Interface - Great Idea Project](https://github.com/LambdaSchool/User-Interface).

In order to do this, you **do not** need to create new forks of these projects. Follow the steps below for each project:

- [x] Add your TL as a collaborator to your fork.
- [x] Go into your project folder, make a new branch `firstname-lastname`
- [x] Add your first and last name to the README.md file in the project and save.
- [x] add/commit/and push to your own branch **Be sure to push to your branch!**
- [x] Create a Pull-Request to submit your work
  - [x] Use your own student fork as the base (compare across forks, base-fork -> master).
  - [x] Add your TL as a reviewer on the Pull-Request
- [x] TL then will count the Assignment as done by merging the HW back into master "STUDENT FORK".

## Stretch

- [ ] While the processes learned here will set you up to be successful in most situations, they are just the tip of the iceberg in learning Git. Independantly research the following topics to learn more about Git.

  - [x] Research and understand what a `merge conflict` is and how to resolve it.
        `merge conflict` happenes when compeating changes are made to the same line of the same file or when one dev edits a file while another dev deletes the same file. To resovle a merge conflict you must choose what changes to incorporate from the different branches in a new commit.

  - [x] Reseach the Git commands `pull`, `rebase`, `merge`. These commands will allow you to bring in changes that other developers push to the master branch.
        git pull is a command that is used to update the local version of a repo from a remote repo. git rebase is the process of combining a sequence of commits to a new base commit. the primary use of rebase is to maintain a linear project history. an example of use is that the master branch has progressed since you have started working on your features branch you want to get the latest updates to the master branch into your feature branch but you want to keep your branch history clean so it appers as if you have been working off the latest master branch. this gives you a later beneifit of a clean meerge into the master branch which can help with debugging if a feature becomes broken when the master branch was updated. git merge joins two or more devs development history together.
  - [x] Reseach the Git commands `reset`, `revert`, `clean`. These commands will allow you to go back and ammends previous commits you have made.
        git reset reverts the current head to the specified state. example igt reset [-q][<tree-ish>] [--] <paths>... resets the index entries for all <paths> to their state at <tree-ish> (it does not affect the working tree or the current branch). git revert will revert some existing commits. git revert is used to record some new commits to reverse the effect of some earlier commits (the working tree must be clean). git clean removes untracked files from the working tree. git clean cleans the working tree by recursivley removing files that are not under version control starting from the current directory'

- [] Research and set up a Graphical User Interface (GUI) Git console.

- [ ] Research and setup SSH keys with Github, so that you do not need to input your username/password each time you push.
