# Setting Up Your Computer

Welcome to day 1 at BloomTech, today we are going to spend time setting up your computer and learning the tools that you will be using to complete this program. Just like day 1 at a job, you will need to get your environment set up to build and run your code. Complete the set up tasks below and then get started on the research questions. Once you have finished check out the submission instructions in the `README.md` file to turn in your assignment for the day. 

## Set Up Tasks 
1. [X] [Download gitbash]() - Windows computers speak in a language called powershell however we will be speaking to our computers in a language called unixshell, in order to all be speaking the same language if you are using a PC you will need to download gitbash and use this program instead of the native command line. Whenever you see an instruction to use the terminal that will be your queue to open up gitbash. On a PC gitbash will be your terminal. 
2. [X] sign up for a [GitHub account](https://github.com/join) - please use a professional username. We recommending using your `firstname` `lastname`
3. [X] [Set up your SSH key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent) - GitHub uses SSH to keep their files secure. You will need to set up one SSH key for every computer that you want to access your GitHub account on. Please ensure you go through all of the steps to generate a new key, add a new key and test your connection. 
4. [X] [Download Zoom](https://zoom.us/download) - make sure your zoom display name is your `first name` `last name`
5. [X] [Download Slack](https://slack.com/intl/en-ca/help/articles/209038037-Download-Slack-for-Windows) - make sure your slack display name is your `first name` `last name` 
6. [X] [Download VS code](https://code.visualstudio.com/download) - this will be the tool you use to write all of your code. We recommend installing the following extensions: 
- [ES Lint](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint)
- [Prettier](https://marketplace.visualstudio.com/items?itemName=esbenp.prettier-vscode)
- [Spell Checker](https://marketplace.visualstudio.com/items?itemName=streetsidesoftware.code-spell-checker)
- [Live Server](https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer)
7. [X] [Download Node.JS](https://nodejs.org/en/) - Please download the latest stable version. We will be using Node.JS to run the tests in all of our javaScript assignments. Test driven development is a common practice in the world of web dev. You can read more about it [here](https://www.freecodecamp.org/news/test-driven-development-what-it-is-and-what-it-is-not-41fa6bca02a2/) 
8. [X] Sign up for a free [codepen account](https://codepen.io/accounts/signup/user/free)

## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You can type your answer below the questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en) doc short for documentation are the instructions on how to use a language, or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your google skills. 

1. What is git? What is the difference between git and GitHub?
    -- Git its a control system. And github its a place where we can store our projects and share it with others so they can also work on it.

2. Why do we create a branch? 
    --We need to create a branch so we can work in some projects without affecting the main project.
    
3. What is the purpose of a pull request?
    --We use git pull when we want to download the remote repository and update the local one.

4. What is the command you can use to switch between branches? For example you are working on a feature branch and you want to switch back to main.
    --git checkout main

5. Explain the difference between `git fetch`, `git merge` and `git pull` what does each command do? 
    -- git merge: Merge branch into the current branch.
    --git fetch: Fetches a specific branch, from the repo. Leave off branch
    to fetch all remote refs.
    --git pull: Fetch the specified remote’s copy of current branch and
    immediately merge it into the local copy.

6. What is a merge conflict? How do you resolve a merge conflict? 
    --An merge conflict occur then git is unable to differentiate the difference between to 2 commits, the best way to fix this its to make any necessary change on one of this commits.