# Git for Web Development Project
In this project you will be using the concepts learned in the Git for Web Development lesson to fork/clone/push/and submit a PR for each project during this sprint.

This project consists of two parts:

## Part One:
You will need to follow the Lambda School Git Workflow to add a file to this project follow the steps below:

- [ ] Create your own version of this repo - Fork
- [ ] Add your TL as a collaborator
- [ ] Clone this repo
- [ ] Create a branch `git checkout -b 'firstName-lastName'`
  - [ ] Add a file to the project called `yourFirstName-yourLastName`.txt. This should contain the link to your completed codepen from part 2 as well as the review questions/answers
  - [ ] Run your usual git commands for adding/committing and pushing **Be sure to push to your branch!**
- [ ] Create a Pull-Request to submit your work
  - [ ] Use your own student fork as the base (compare across forks, base-fork -> master).
  - [ ] Add your TL as a reviewer on the Pull-Request
- [ ] TL then will count the Assignment as done by merging the HW back into master "STUDENT FORK".

## Part Two:
1. fork this codepen https://codepen.io/BritHemming/pen/eYYEoPa?editors=1100
2. You will be marking up all of the HTML and styling it to look like this: https://codepen.io/BritHemming/full/jONmxOm using CSS
* this should be review from yesterday/ extra practice
3. After you are finished please copy the review questions into your .txt file and answer them
4. don't forget to add, commit and push your changes.


## Stretch
Stretch Review questions: 
    1. What is the difference between an inline element and a block element?
    2. What happens when an element is positioned absolutely? 
    3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? 
    4. Name 3 elements that are diplay block by default, 2 elements that are display inline by default and 1 element that is display inline-block by default
    5. In your own words, explain the box model. What is the fix for the box model? 
Stretch Git Tasks
- [ ] While the processes learned here will set you up to be successful in most situations, they are just the tip of the iceberg in learning Git. Independently research the following topics to learn more about Git.
  - [ ] Research and understand what a `merge conflict` is and how to resolve it.
  - [ ] Research the Git commands `pull`, `rebase`, `merge`. These commands will allow you to bring in changes that other developers push to the master branch.
  - [ ] Research the Git commands `reset `, `revert`, `clean`. These commands will allow you to go back and amends previous commits you have made.

- [ ] Research and set up a Graphical User Interface (GUI) Git console. 

- [ ] Research and setup SSH keys with GitHub, so that you do not need to input your username/password each time you push. 



this is another change

    1. What is Semantic HTML? 
    Semantic HTML is html that has meaning and makes code easier to read and understand
    2. What is HTML used for? 
    HTML, Hyper text markup language is a language used to tell web browsers how display a webpage
    3. What is an attribute and where do we put it? 
    An attribute is used to select an element with a specific attribute or attribute value.
    4. What is the h1 tag used for? How many times should I use it on a page?
    An H1 tag is used for the title of a page. It should only be used once in a page in most cases
    5. Name two tags that have required attributes
    anchor tags and image tags are tow tags that require attributes
    6. What do we put in the head of our HTML document? 
    An Html tag goes at the top of a page
    7. What is an id? 
    an id is an attribute that can be attached to a tag to allow an anchor tag to reference it
    8. What elements can I add an id to? 
    You can add an id to any tag
    9. How many times can I use the same id on a page?
    You should only use an id tag once 
    10. What is a class? 
    A class is an attribute that can be added to a tag to allow it to be styled. unlike ids classes can be used many times over and are primarily for styling.
    11. What elements can I add a class to? 
    You can add a class to any element
    12. How many times can I use the same class on a page? 
    You can use a class as many times as you want
    13. How do I get my link to open in a new tab?
    you need to put target="_blank" in the anchor tag
    14. What is the alt attribute used for? 
    The alt attribute is used to tell what an image is to search engines and screen readers, as well as when the image fails to load
    15. How do I reference an id?
    You can reference an id by using the # symbol followed by the name of the id ex: #id1
    16. What is the difference between a section and a div
    A section is a semantic tag while a div tag has no inherit meaning
    17. What is CSS used for? 
    Css is is used to style your html without cluttering up the html document with inline styles
    18. How do we select an element? Example - every h2 on the page
    to directly select an element in css you simply need to jsut write name of the tag and use it the same way that you'd style a class
    19. What is the difference between a class and an id? - Give me an example of when I might use each one
    class are meant to be used repeatedly while ids are single use. A class is used for styling and an id is used to give an anchor tag a place to go
    20. How do we select classes in CSS?
    classes are selected with a period and the class name
    21. How do we select a p element with a single class of “human””?
    p.class
    22. What is a parent child selector? When would this be useful? 
    A parent selector is a selector that passes down styling to children classes. when you have nested classes the classes inside the first class are the children and the first is the parent
    23. How do you select all links within a div with the class of sidebar?
    .sidebar div a{}
    24. What is a pseudo selector?
    a pseudo selector is a class like
    ul:last-child{}
    25. What do we use the change the spacing between lines?
    <br> or the line spacing style
    26. What do we use to change the spacing between letters?
    the letter spacing style
    27. What do we use to to change everything to CAPITALS? lowercase? Capitalize?
    the text-transform property
    28. How do I add a 1px border around my div that is dotted and black?
    you give it the border styling and use border: 1px dotted black
    29. How do I select everything on the page? 
    *{}
    30. How do I write a comment in CSS?
    /* */
    31. How do I find out what file I am in, when I am using the command line? 
    you can fnd out what file you're in by reading the line above the command line
    32. Using the command line - how do I see a list of files/folders in my current folder?
    you can see all the files and folders in your current folder by using the ls command
    33. How do I remove a file via the command line? Why do I have to be careful with this? 
    using the remove command you can remove files, however you don't have a way to retrieve these files and are given no warning about this
    34. Why should I use version control? 
    Using version control allows you to revert to a previous version if you encounter problems.
    35. How often should I commit to github?
    You should commit to github fairly frequently. Britt said to do it every 20 minutes
    36. What is the command we would use to push our repo up to github? 
    git push
    37. Walk me through Lambda's git flow.
    git add --> git commit--> git push and then check with git status


Stretch Questions

    1. What is the difference between an inline element and a block element?
    inline elements only take up as much width as is needed to display the contents of the element, while block elements are those that take the full width available on a web page.
    2. What happens when an element is positioned absolutely? 
    When an element is absolutely positioned it relative to the viewport and is fixed.
    3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? 
    you can change the display style of the element to inline
    4. Name 3 elements that are display block by default, 2 elements that are display inline by default and 1 element that is display inline-block by default
    block: <p><div><ol><ul>
    inline:<span><img><a>
    5. In your own words, explain the box model. What is the fix for the box model? 
    The box model is a box that is formed around the content using padding, border and margin.