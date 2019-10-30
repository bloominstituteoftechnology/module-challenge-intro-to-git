# Git for Web Development Project
In this project you will be using the concepts learned in the Git for Web Development lesson to fork/clone/push/and submit a PR for each project during this sprint.

This project consists of two parts:

## Part One:
You will need to follow the Lambda School Git Workflow to add a file to this project follow the steps below:

- [ ] Create your own version of this repo - Fork
- [ ] Add your TL as a collaborator
- [ ] Clone this repo
- [ ] Create a branch `git checkout -b 'firstName-lastName'`
  - [ ] Add a file to the project called `yourFirstName-yourLastName`.txt. This file can contain anything.
  - [ ] Run your usual git commands for adding/committing and pushing **Be sure to push to your branch!**
- [ ] Create a Pull-Request to submit your work
  - [ ] Use your own student fork as the base (compare across forks, base-fork -> master).
  - [ ] Add your TL as a reviewer on the Pull-Request
- [ ] TL then will count the Assignment as done by merging the HW back into master "STUDENT FORK".

## Part Two:
Go back and follow the same steps for your [UI-III-Flexbox project](https://github.com/LambdaSchool/UI-III-Flexbox) and your [User Interface - Great Idea Project](https://github.com/LambdaSchool/User-Interface).

In order to do this, you **do not** need to create new forks of these projects. Follow the steps below for each project:

- [ ] Add your TL as a collaborator to your fork. 
- [ ] Go into your project folder, make a new branch `firstname-lastname`
- [ ] Add your first and last name to the `README.md` file in the project and save.
- [ ] add/commit/and push to your own branch  **Be sure to push to your branch!**
- [ ] Create a Pull-Request to submit your work
  - [ ] Use your own student fork as the base (compare across forks, base-fork -> master).
  - [ ] Add your TL as a reviewer on the Pull-Request
- [ ] TL then will count the Assignment as done by merging the HW back into master "STUDENT FORK".

## Stretch
- [ ] While the processes learned here will set you up to be successful in most situations, they are just the tip of the iceberg in learning Git. Independently research the following topics to learn more about Git.
  - [ ] Research and understand what a `merge conflict` is and how to resolve it.
  - [ ] Research the Git commands `pull`, `rebase`, `merge`. These commands will allow you to bring in changes that other developers push to the master branch.
  - [ ] Research the Git commands `reset `, `revert`, `clean`. These commands will allow you to go back and amends previous commits you have made.

- [ ] Research and set up a Graphical User Interface (GUI) Git console. 

- [ ] Research and setup SSH keys with GitHub, so that you do not need to input your username/password each time you push. 


https://codepen.io/llpookyll/pen/MWWEeab

1. What is Semantic HTML?
    html that has meaning

2. What is HTML used for? 
    Structering a website

3. What is an attribute and where do we put it? 
    an attribute goes inside a tag and it's a way to assign a style to that tag in css

4. What is the h1 tag used for? How many times should I use it on a page?
    The h1 tag is used to tell you what the whole page is about and should only be used once per page

5. Name two tags that have required attributes
    img, a

6. What do we put in the head of our HTML document? 
    data about the html document

7. What is an id? 
    an attribute that can be used to apply styles to html tags

8. What elements can I add an id to? 
    any html element that you want to add specific styles to

9. How many times can I use the same id on a page? 
    you can only use that id once on a page

10. What is a class? 
    same as an id but can identify multiple elements whereas id's can only do 1

11. What elements can I add a class to? 
    html elements that you want to style

12. How many times can I use the same class on a page? 
    as many times as you want

13. How do I get my link to open in a new tab?
    target="_blank"

14. What is the alt attribute used for? 
    it runs alternitave text for accessablity purposes

15. How do I reference an id?
    #id

16. What is the difference between a section and a div
    Section is to group like content and split up the page. diiv is more for styling. it's less specific

17. What is CSS used for? 
    Styling html pages

18. How to we select an element? Example - every h2 on the page
    h2{

    }

19. What is the difference between a class and an id? - Give me an example of when I might use each one
    class can identify multiple elements and id identifies just one.

20. How do we select classes in CSS?
    .class

21. How do we select a p element with a single class of “human””?
    p.human

22. What is a parent child selector? When would this be useful? 
    the previous question is an example of a parent child selector "p.human"

23. How do you select all links within a div with the class of sidebar?
    div.sidebar a{

    }

24. What is a pseudo selector?

25. What do we use the change the spacing between lines?
    line-spacing:;

26. What do we use to change the spacing between letters?
    letter-spacing:;

27. What do we use to to change everything to CAPITALS? lowercase? Capitalize?
    capitalize: lowercase: uppercase:

28. How do I add a 1px border around my div that is dotted and black?
    div{
        border: 1px dotted;
    }

29. How do I select everything on the page? 
    body

30. How do I write a comment in CSS?
    /*   */

31. How do I find out what file I am in, when I am using the command line? 
    pwd

32. Using the command line - how do I see a list of files/folders in my current folder?
    ls
33. How do I remove a file via the command line? Why do I have to be careful with this? 
    rm theres no undoing it once you do it

34. Why should I use version control? 
    to save and merge projects

35. How often should I commit to github?
    ever half our or so

36. What is the command we would use to push our repo up to github? 
    git push -u origin
37. Walk me through Lambda's git flow. 
    fork repo, add TL as colaborator, clone repo, use git checkout -b to create your own branch, code . to bring it up in your vs code, save your vs code, git add ., check status, git commit -m"", git push -u, new pull request, make TL your reviewer, make sure you're using your branch, complet pull request.

Stretch Questions

    1. What is the difference between an inline element and a block element?
        block elements naturally span the eniter page and are stacked vertically inline elements are as wide as the content inside them and are orderd horizontally

    2. What happens when an element is positioned absolutely? 
        It's positioned in the parent elemement wherever you tell it to (center, top right, top left, etc..)
    3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? 
    Display: inline-block;

    4. Name 3 elements that are diplay block by default, 2 elements that are display inline by default and 1 element that is display inline-block by default
     block elements: <div>, <p>, <section>. Inline elements:<span>, <map>. Inline block: <img>.
    5. In your own words, explain the box model. What is the fix for the box model? 
        the box model is used for positioning of elements in css and the over all page layout.