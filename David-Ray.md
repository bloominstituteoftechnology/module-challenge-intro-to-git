Copy the questions below into the firt-lastname.txt file on your github repo - answer each question and then push your changes. 

    1. What is Semantic HTML? 
    Is providing meaning to your file by adding elements. 

    2. What is HTML used for? 
    HTML is use to write up the actually document.

    3. What is an attribute and where do we put it?
    HTML attribute provides additional information and always specified in the start tag.

    4. What is the h1 tag used for? How many times should I use it on a page?
    A H1 tag is a heading tag and can be use as many times as you want.

    5. Name two tags that have required attributes
    href, src, alt, width and height.

    6. What do we put in the head of our HTML document? 
    <!DOCTYPE html>

    7. What is an id? 
    an ID is a CSS selector.

    8. What elements can I add an id to? 
    you can add an ID only once and to any element. 

    9. How many times can I use the same id on a page? 
    one time.

    10. What is a class? 
    class is a CSS selector as well. It selects HTML elements with specific class attribute.

    11. What elements can I add a class to?
    You can add this to any element.

    12. How many times can I use the same class on a page? 
    an many times as you want.

    13. How do I get my link to open in a new tab?
    the _blank opens a new page 

    14. What is the alt attribute used for? 
    handicap purposes

    15. How do I reference an id?
    You refrences an Id by typing "#".

    16. What is the difference between a section and a div?
    A div is non semantic and you can wrap an entire HTML doc. a section defines things like header, footers, chapters, columns, etc.

    17. What is CSS used for? 
    CSS is used for styling the HTML document.

    18. How to we select an element? Example - every h2 on the page

                h2{}

    this is how we select the h2 element in a CSS file.

    19. What is the difference between a class and an id? - Give me an example of when I might use each one.
    
    The Id of an element is unique to the html doc. so the Id selector is used to grab that unique element.

    the class selector can select any element assigned to that class.

    20. How do we select classes in CSS?

            <div class="example"> this is a class</div>

            CSS
            class selector: .example{}

    21. How do we select a p element with a single class of “human””?

            <p class="human></p>
                CSS:
                p .human{}

    22. What is a parent child selector? When would this be useful?

     it is only used to select elements with specific parents in the HTML doc.

    23. How do you select all links within a div with the class of sidebar?

        nav .sidebar{}

    24. What is a pseudo selector?

    pseudo help you style an element when the mouse hovers over it. Links you clicked on vs the ones you didn't looks different.

    25. What do we use the change the spacing between lines?

    we use: line-height: Normal;
    line-height is a line property.

    26. What do we use to change the spacing between letters?

    we use: letter-spacing

    27. What do we use to to change everything to CAPITALS? lowercase? Capitalize?

    we use: text-transform: uppercase;lowercase; capitalize;

    28. How do I add a 1px border around my div that is dotted and black?

            div{
                border: dotted 1px black
            }
    29. How do I select everything on the page? 

        by the universal selector:

                *{
                }

    30. How do I write a comment in CSS?

    /* this is how you write a comment in css*/

    31. How do I find out what file I am in, when I am using the command line? 

        If you look at the root it can pretty much tell you where you are.

    32. Using the command line - how do I see a list of files/folders in my current folder?

    type in "ls"

    33. How do I remove a file via the command line? Why do I have to be careful with this? 

    rm *file name*
    You should be careful because there is no warning once you do this. It will be gone permenently.

    34. Why should I use version control? 

    35. How often should I commit to github?

    Everytime you make a change on a project.

    36. What is the command we would use to push our repo up to github? 
    
            'git push'

    37. Walk me through Lambda's git flow. 

    Clone the file in git bash
    Make a branch with my first and last name
    Add to director
    Commit to director
    Push to github.
    Once push to github do a pull request with team leader and project leader.

Stretch Questions

    1. What is the difference between an inline element and a block element?

    an inline element line elements up vertically and block elements will line them up horizontally.

    2. What happens when an element is positioned absolutely?

    it just means its relative to its firsts positioned parent element


    3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? 

        By using the BOX MODEL

    4. Name 3 elements that are diplay block by default, 2 elements that are display inline by default and 1 element that is display inline-block by default

    block: P, section, columns
    inline: spam, div
    inline-block: span
    

    5. In your own words, explain the box model. What is the fix for the box model?

    The box model consist of padding margin and borders.

    margin is the area outside the box. padding is the area between the content and the border. and the border is between the margin and padding. 
    ..


