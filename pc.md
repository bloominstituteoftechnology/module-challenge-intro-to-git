# Setting Up Your Computer

Welcome to day 1 at BloomTech, today we are going to spend time setting up your computer and learning the tools that you will be using to complete this program. Just like day 1 at a job, you will need to get your environment set up to build and run your code. Complete the set up tasks below and then get started on the research questions. Once you have finished check out the submission instructions in the `README.md` file to turn in your assignment for the day. 

## Set Up Tasks 
1. [ ] [Download gitbash]() - Windows computers speak in a language called powershell however we will be speaking to our computers in a language called unixshell, in order to all be speaking the same language if you are using a PC you will need to download gitbash and use this program instead of the native command line. Whenever you see an instruction to use the terminal that will be your queue to open up gitbash. On a PC gitbash will be your terminal. 
2. [ ] sign up for a [GitHub account](https://github.com/join) - please use a professional username. We recommending using your `firstname` `lastname`
3. [ ] [Set up your SSH key](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent) - GitHub uses SSH to keep their files secure. You will need to set up one SSH key for every computer that you want to access your GitHub account on. Please ensure you go through all of the steps to generate a new key, add a new key and test your connection. 
4. [ ] [Download Zoom](https://zoom.us/download) - make sure your zoom display name is your `first name` `last name`
5. [ ] [Download Slack](https://slack.com/intl/en-ca/help/articles/209038037-Download-Slack-for-Windows) - make sure your slack display name is your `first name` `last name` 
6. [ ] [Download VS code](https://code.visualstudio.com/download) - this will be the tool you use to write all of your code. We recommend installing the following extensions: 
- [ES Lint](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint)
- [Prettier](https://marketplace.visualstudio.com/items?itemName=esbenp.prettier-vscode)
- [Spell Checker](https://marketplace.visualstudio.com/items?itemName=streetsidesoftware.code-spell-checker)
- [Live Server](https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer)
7. [ ] [Download Node.JS](https://nodejs.org/en/) - Please download the latest stable version. We will be using Node.JS to run the tests in all of our javaScript assignments. Test driven development is a common practice in the world of web dev. You can read more about it [here](https://www.freecodecamp.org/news/test-driven-development-what-it-is-and-what-it-is-not-41fa6bca02a2/) 
8. [ ] Sign up for a free [codepen account](https://codepen.io/accounts/signup/user/free)

## Research Questions 

Now that you are all set up, it's time to learn a little more about the tools of the trade. Edit this file and answer the following questions. You can type your answer below the questions. You are going to need to start familiarizing yourself with the [GitHub docs](https://docs.github.com/en) doc short for documentation are the instructions on how to use a languge, or program. A large part of your job as a developer will be learning how to read and work with documentation. Please reference the GitHub docs when answering the questions below. If you cannot find what you are looking for in the docs, you can always start to practice your google skills. 

1. What is git? What is the difference between git and GitHub?
2. Why do we create a branch? 
3. What is the purpose of a pull request? 
4. What is the command you can use to switch between branches? For example you are working on a feature branch and you want to switch back to main. 
5. Explain the difference between `git fetch`, `git merge` and `git pull` what does each command do? 
6. What is a merge conflict? How do you resolve a merge conflict? 

1. Git is an open souce version control system. We run this software locally and use it to track changes made in a set of files and remotely connect to and interact with online hosts like GitHub. While Git is a version control system, GitHub is an external cloud based hosting services that enables us to manage git repositories stored in GitHub

2. We create a branch typically when we want to build a new feature based on the master branch. THis enables us to carry out any development and testing separate from our master/main branch

3. A pull request enables us to notify other collaborators that we have made changes. Giving us a chance to discuss and review changes we have made to see if they don't conflict/create issues with the main branch

4. git switch

5. `git fetch` gather commits from our target branch that don't exist in the current branch we are on. `git merge` joins two or more conflicting histories of commits and `git pull` automatically merges commits we have made to a branch


6. Merge conflict is when different changes have been made to the same line(s) of one or multiple miles. We resolve this by opening the file and making necessary changes to resolve these differences