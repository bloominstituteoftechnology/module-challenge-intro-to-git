Code pen - https://codepen.io/gamemeup8/pen/qBOdNNB

Pen questions:
1. What is Semantic HTML? Semantic HTML is an older style of HTML used before name clashes would start to occur. Its a markup language that let you custom name and style your HTML tags. Its helps to reinforce the meaning of information in web pages. 
2. What is HTML used for? HTML is a markup language document that allows the developer to execute css, javascript, python, perl, or php. 
3. What is an attribute and where do we put it? Attributes help define additional characteristics of an element. They can be found at the start of of the specified tag you consist of a name value pair which is enclosed in parenthesis. An example is width and src inside an <img width='3px' src='file.jpg' /> though src is also an image path while width is strictly an attribute.  
4. What is the h1 tag used for? How many times should I use it on a page? It's the largest there is out of 6 different headings. You should typically want it to be the single most largest heading on the page. 
5. Name two tags that have required attributes. src in the <img> tag <img src='file.jpg' > or href in the <a> tag <a href='page.php'> 
6. What do we put in the head of our HTML document? <title>, <link>, <script>, <meta>, <style>, <base>, <noscript>
7. What is an id? An id names a element and can only be used one time or you would be better off naming it as a class. 
8. What elements can I add an id to? id is a global attribute and can be added to any HTML element. 
9. How many times can I use the same id on a page? You may use the same id only once per page, otherwise it would be a class.  
10. What is a class? A class is an attribute just like an id but can be used many times. Its used more for presenting an abstract idea and to generalize than with id which is more specific and there can only ever be one of per page. 
11. What elements can I add a class to? A class is used to describe any html elements attribute. 
12. How many times can I use the same class on a page? The same class can be used on multiple elements on the same page. 
13. How do I get my link to open in a new tab? Use the target =’blank’ attribute in the anchor tag <a href=’site.html’  target='blank'> 
14. What is the alt attribute in the image tag used for? If the user experiences problems or the image does not load in their browser then the alt attribute will provide alternative information on the image. This attribute is best for screen reading browser or errors.                                                                                                                                                                                                                                                                                  
15. How do I reference an id? By referencing an id selector within any html element with id=’idSelectorName’.  
16. What is the difference between a section and a div? A section is used to define sections of the html document such as header, footer, aside, or each chapter. It uses semantics and only follow a single theme. Div is a divisor and can be used for more advanced concepts where the styling does not apply to a general theme though it can still be general if the developer chooses. 
17. What is CSS used for? CSS is used to style an HTML document. 
18. How to we select an element? Example - every h2 on the page. By defining styles for the element with external, or internal CSS. You can also use inline CSS but because of its weight specifics you should generally only do so if that is the only option. 
19. What is the difference between a class and an id? - Give me an example of when I might use each one. They can both be used as a styling attribute for elements to give them special characteristics. The main difference is that a class is less specific than an id. When you weigh them out a class is worth 10  points and an ID is worth 100 points. This is because classes can be used more than once per page and an ID is only ever used one time per page. It is never okay to use a id more than once because if it is, you need to change it to a class. An example is a class of student and an id of Nicholas-Lacapria inside a Lambda html element. 
20. How do we select classes in CSS? By placing a dot before the class name and enclosing the CSS styles with curly braces. Each line should also end with a  semicolon. An example is
	.student{
	width: 40%;
	height: 30%;
	margin: 2px 1px;
	padding:2px 2px 1px 1px;
	border: 20px solid #00CED1;
	
}

21. How do we select a p element with a single class of “human””?
<p class=’human’>Text of a human</p>
22. What is a parent child selector? When would this be useful? It is a selector that uses the > to show what parent is inside of what child. This is useful when you want to only use it in cases when a certain element or selector is found within an occurrence of a different element or selector.
23. How do you select all links within a div with the class of sidebar? Div.sidebar > link
24. What is a pseudo selector? Pseudo class selectors already have pre-defined characterisitics or jobs they invoke on an element. There are a lot of these and they handle tasks like hovering or what to do for links that have browser history in it already. 
25. What do we use to the change the spacing between lines? Line-height: 4px;

26. What do we use to change the spacing between letters? Letter-spacing: .2rem

27. What do we use to to change everything to CAPITALS? lowercase? Capitalize?

28. How do I add a 1px border around my div that is dotted and black? border: 1px dashed black;

29. How do I select everything on the page? *{ }

30. How do I write a comment in CSS?/* */

31. How do I find out what file I am in, when I am using the command line? pwd

32. Using the command line - how do I see a list of files/folders in my current folder?ls -a -l or dir in windows
33. How do I remove a file via the command line? Why do I have to be careful with this? 
34. Why should I use version control? Version control is great because it will help debug your project, collaborate with team mates, and it provides extra up-to-date information on the project.
35. How often should I commit to github? Anytime you feel like a good stopping point has been achieved, or if you feel like something in the project needs to be explained outside of comments. 
36. What is the command we would use to push our repo up to github? Git push origin  branch-name
37. Walk me through Lambda's git flow. First fork or own the repo to your username’s repo, Add the TL as a Collaborator, Clone the repo to own a local copy on your hard drive, create a branch to implement the project on with git checkout -b  first-name  so you have a branch to submit your private reserve to. Once complete make a pull request so the TL is added as a reviewer. Once TL has graded the assignment it will be merged to your fork onto the master branch.


Stretch Questions

1. What is the difference between an inline element and a block element?
2. What happens when an element is positioned absolutely? 
3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? 
4. Name 3 elements that are display block by default, 2 elements that are display inline by default and 1 element that is display inline-block by default
5. In your own words, explain the box model. What is the "fix" for the box model, in other words, how do we make all elements respect the width we've given them? 



Stretch Review questions: 
1. What is the difference between an inline element and a block element? Inline elements are more flexible than block elements. 
With block elements you are going to get a new line or another element next to each other depending on the height and weight. With inline elements you can place one within another or overlap them to your choosing depending on how you configure the display. Sometimes you will have to choose one or the other depending on the circumstances. However I think an inline-block element is the best to use because 
of how easy the element is to move around or position with float.  
2. What happens when an element is positioned absolutely? It will have a fixed position based on its computed values. Its harder for an ancestor element to affect it since its value will always correspond to the same position.   
3. How do I make an element take up only the amount of space it needs but also have the ability to give it a width? You should use relative positioning and then use top left bottom and right to position it. Next width or height can be added to allow it to take the full effect you wanted in the first place. 
4. Name 3 elements that are display block by default, 2 elements that are display inline by default and 1 element that is display inline-block by default?
3 Display Block - div, h1 - h6, form, header or p Any elements that start with a new line are block display elements
2 display inline - span a or img Any items that can be placed next to eachother are going to be inline display elements. I've found alot of libraries with nice features seem to make use of this element. For example icons always seem to get displayed with inline elements such as i or span. 1 inline-block - class id or element that is an inline element but also has padding and margins on all four sides.   
5. In your own words, explain the box model. What is the fix for the box model? The box model is defined by padding, margin, border, width and height.   