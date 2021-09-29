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
   inline elements != new line in the flow, block elements however do.


    2. What happens when an element is positioned absolutely? 
    it gets taken out of the flow and the flow opperates as if it does not exist.


    3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? 
    by using inline elements.




    4. Name 3 elements that are display block by default, 2 elements that are display inline by default, and 1 element that is display inline-block by default
    <address>, <blockquote>, <legend> are block elements, an anchor or link is an inline element, top bottom margins & paddings aare inline-block.



    5. In your own words, explain the box model. What is the fix for the box model? 
    CSS- used to talk about layout designs; a box that wraps around every HTML element (borders,padding,content,margins)


Stretch Git Tasks
  - [ X] Research and understand what a `merge conflict` is and how to resolve it.

  merging conflicts happen when Git cannot auto determine which upload changes made by two developers is correct. only the latest person uploading gets the conflict notice and then resolves it by editing the conflict file.once resolved Git will create a new merge commit to finalize the merge. 

  - [X ] Research the Git commands `pull`, `rebase`, `merge`. These commands will allow you to bring in changes that other developers push to the main branch.

  the git pull is used to update the local repository. 

  rebase one of two ways to integrate changes from one branch to another, its the process of moving sequence or commits to new base commit.
  used to maintain a linear project history. 

  merge is putting forked history back together, take independent lines and merge into single branch. 




  - [ x] Research the Git commands `reset `, `revert`, `clean`. These commands will allow you to go back and amends previous commits you have made.

  reset files on Git used to selectively reset hunks of data. 
  revert is used to reverese the effects of some earlier commits (usually faulty ones)

  clean used to delete untracked files from the local files.

- [ x] Research and set up a Graphical User Interface (GUI) Git console. 
github desktop downloaded

- [ x] Research and setup SSH keys with GitHub, so that you do not need to input your username/password each time you push. 
done


<!-- Questions to Submit in today's file first-lastname.txt --> 
<!--
Copy the questions below into the first-lastname.txt file on your github repo - answer each question and then push your changes. 

    1. What is Semantic HTML? semantic elements clearly defines its content(form,table,article)

    2. What is HTML used for? HTML creates the layout for a website, a markup web browser to publish online documents (text,tables,list,photos)

    3. What is an attribute and where do we put it? 
    html attributes are a modifier of html tyle, modifies default functionality of the element type.

    4. What is the h1 tag used for? How many times should I use it on a page?
    Header 1, should only be used once in a page

    5. Name two tags that have required attributes
    img element alt: alternative text, src:source location URL img file

    6. What do we put in the head of our HTML document?  
    <header>

    7. What is an id? 
    specific ID for html element, must be unique within the doc, used to point to specific syle.


    8. What elements can I add an id to? 

    can be added to a style on a style sheet.

    9. How many times can I use the same id on a page? 
    only once 

    10. What is a class? 

    a way to access specific elements 

    11. What elements can I add a class to? 

    text,buttons,spans,divs,tables,images all page elements.

    12. How many times can I use the same class on a page? 
    no limit

    13. How do I get my link to open in a new tab?
    create anchor tags, only suggested when directing the client to external site.

    14. What is the alt attribute in the image tag used for?
    adds text description for an image on a web page. images, graphs, and bullets.

    15. How do I reference an id?
    #(followed by ID name)

    16. What is the difference between a section and a div
    sections are grouped, <div> has no meaning the meaning is found in the class associated with it. 

    17. What is CSS used for? used to give more presentation to web pages, a language used to include colors, layout, fronts, can adapt to different devices and can be use with any XML markup language.

    18. How to we select an element? Example - every h2 on the page
    select elements are used to select information on the web page.
    starting tag + content + ending tag= element 

    19. What is the difference between a class and an id? - Give me an example of when I might use each one

    ID can only be one to page, and only apply to one element. Class can have multiple. h1=ID, class = <p>

    20. How do we select classes in CSS?
    write a . followed by the name of the class


    21. How do we select a p element with a single class of “human””?
    .human p{

    }

    22. What is a parent child selector? When would this be useful? 
    used to match elements which are second(child) to specific elements. parent>child. more precise than traditional contextual selector. 


    23. How do you select all links within a div with the class of sidebar?
    .sidebar{

    }
    24. What is a pseudo selector?
    pseudo classes to add styles to selectors but only when those selectors meet certain conditions. uses a colon : with focus, active, or hover {}
  
    25. What do we use the change the spacing between lines?
    line-height

    26. What do we use to change the spacing between letters?
    letter-spacing

    27. What do we use to to change everything to CAPITALS? lowercase? Capitalize?
    text-transform capitals
    text-transform lowercase
    text-transform capitalize


    28. How do I add a 1px border around my div that is dotted and black?
    div{
      border: dotted black;
    }
    29. How do I select everything on the page? 
    *selector

    30. How do I write a comment in CSS?
    /* add comment*/

    31. How do I find out what file I am in, when I am using the command line? 
    .find

    32. Using the command line - how do I see a list of files/folders in my current folder?
    ls

    33. How do I remove a file via the command line? Why do I have to be careful with this? 

    rm - doesnt ask for verification and cant be undone

    34. Why should I use version control?
     keeps track of changes, keeps team on the latest version. 

    35. How often should I commit to github?
    whenever finish a step. 

    36. What is the command we would use to push our repo up to github? 
    git push -u orgin branch-name

    37. Walk me through Lambda's git flow. 

    git add . 
    git commit -m 'message'
    git push -u origin branch-name
    create a pull request - 
    compare and pull request 
    compare master or main to your branch
    submit the url for pull request in canvas
# Qualyn-Margain
