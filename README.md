# Git for Web Development Project
In this project you will be using the concepts learned in the Git for Web Development lesson to fork/clone/push/and submit a PR for each project during this sprint.

This project consists of two parts:

## Task 1: Set up Project
You will need to follow the Lambda School Git Workflow to add a file to this project follow the steps below:

- [ ] Create your own version of this repo - Fork
- [ ] Clone this repo
- [ ] Create a branch `git checkout -b 'firstName-lastName'`
  - [ ] Add a file to the project called `yourFirstName-yourLastName`.txt. This should contain the link to your completed codepen from part 2 as well as the review questions/answers
  - [ ] Run your usual git commands for adding/committing and pushing **Be sure to push to your branch!**
- [ ] Create a Pull-Request to submit your work
  - [ ] Use your own student fork as the base (compare across forks, base-fork -> main).


## Task 2: MVP
1. fork this codepen https://codepen.io/BritHemming/pen/eYYEoPa?editors=1100
2. You will be marking up all of the HTML and styling it to look like this: https://codepen.io/BritHemming/full/jONmxOm using CSS
* this should be review from yesterday/ extra practice
3. After you are finished please copy the review questions into your .txt file and answer them
4. don't forget to add, commit and push your changes.


## Task 3: Stretch
Stretch Review questions: 
    1. What is the difference between an inline element and a block element?
    2. What happens when an element is positioned absolutely? 
    3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? 
    4. Name 3 elements that are diplay block by default, 2 elements that are display inline by default and 1 element that is display inline-block by default
    5. In your own words, explain the box model. What is the fix for the box model? 
Stretch Git Tasks
- [ ] While the processes learned here will set you up to be successful in most situations, they are just the tip of the iceberg in learning Git. Independently research the following topics to learn more about Git.
  - [ ] Research and understand what a `merge conflict` is and how to resolve it.
  - [ ] Research the Git commands `pull`, `rebase`, `merge`. These commands will allow you to bring in changes that other developers push to the main branch.
  - [ ] Research the Git commands `reset `, `revert`, `clean`. These commands will allow you to go back and amends previous commits you have made.

- [ ] Research and set up a Graphical User Interface (GUI) Git console. 

- [ ] Research and setup SSH keys with GitHub, so that you do not need to input your username/password each time you push. 


https://codepen.io/wzd200/pen/LYZLWyz?editors=1100

   1. What is Semantic HTML?
Semantic HTML is code that is written and immediately understood for the sake of ordering a webpage.
l
    2. What is HTML used for?
To place and markup text on a webpage. 
    3. What is an attribute and where do we put it?
We put attributes inside of opening tags. 
    4. What is the h1 tag used for? How many times should I use it on a page?
Used to make the first header, or title, of a page. It should be used only 1 time.
    5. Name two tags that have required attributes
<a> and <img>
    6. What do we put in the head of our HTML document?
Metadata 
    7. What is an id?
A classifier for a tag that should only be used once per unique ID. 
    8. What elements can I add an id to?
<div> <section> etc.
    9. How many times can I use the same id on a page?
You should use the same ID once per page. 
    10. What is a class?
A classifier that can be assigned to multiple elements.
    11. What elements can I add a class to? 
<div> <section> <img> etc.
    12. How many times can I use the same class on a page?
You can use classes on as many elements in a page as you like to group them together efficiently. 
    13. How do I get my link to open in a new tab?
“_blank”
    14. What is the alt attribute in the image tag used for?
Metadata for an image to allow for accessibility for those who are visually impaired or if the image does not load.
    15. How do I reference an id?
You reference IDs with a # followed by the ID name.
    16. What is the difference between a section and a div
Section is used for semantic purposes, div has more of a focus on being used for style purposes.
    17. What is CSS used for?
Styling HTML elements on a webpage. 
    18. How do we select an element? Example - every h2 on the page
We select elements by using their CSS selector followed by open and closed curly braces.
    19. What is the difference between a class and an id? - Give me an example of when I might use each one
The difference between classes and IDs lies in scope of specificity. Classes can be assigned to multiple elements whilst IDs should be assigned to a single, unique element. Classes can be assigned to a series of images that all have dogs in them, whilst an ID named “Title” could be assigned to the H1 element of the page.
    20. How do we select classes in CSS?
We select classes in CSS with a period followed by the class name.
    21. How do we select a p element with a single class of “human”?
.human p {}
    22. What is a parent child selector? When would this be useful?
Element > element would be useful to select elements with a specific parent - such as <divs>
    23. How do you select all links within a div with the class of sidebar?
div.sidebar {}
    24. What is a pseudo selector?
A selector that defines a special state of an element - denoted with a colon.
    25. What do we use to change the spacing between lines?
Line-height
    26. What do we use to change the spacing between letters?
Letter-spacing
    27. What do we use to change everything to CAPITALS? lowercase? Capitalize?
Uppercase, lowercase, capitalize
    28. How do I add a 1px border around my div that is dotted and black?
Border: 1px dotted black;
    29. How do I select everything on the page?
* {} 
    30. How do I write a comment in CSS?
/*  */
    31. How do I find out what file I am in, when I am using the command line?
$ pwd 
    32. Using the command line - how do I see a list of files/folders in my current folder?
$ ls
    33. How do I remove a file via the command line? Why do I have to be careful with this?
Rm - but you should be careful with this because github saves your work and you don’t want to get rid of anything important before pushing it back at the risk of losing your work. 
    34. Why should I use version control? 
To go back to an earlier version of your project without having to start all over again.
    35. How often should I commit to github?
Often.
    36. What is the command we would use to push our repo up to github?
Git push 
    37. Walk me through Lambda's git flow.
First, fork the repo. Next, check if it’s yours. Third, clone the repo. Then, go to your directory in the terminal. Afterward, clone the repo into your terminal to make local changes and use cd to get into the repo. Create a branch using git checkout -b ‘firstName-lastName’. After the project is finished, use git add then git commit -m before using git-push to put everything on github. Finally, you make a pull request. 



Git Workflow: 

Checkout A Branch: 
- git checkout -b 'branch-name'

For Submissions
- git add . 
- git commit -m "Commit Message Goes Here"
- git push -u origin 'branch-name'