# Preprocessing I: Digital Resume

For this project you will be building a digital resume from scratch. You will be required to use specific preprocessing skills to accomplish your tasks.  

## Task 1: Set Up The Project With Git

- [ ] Create a forked copy of this project.
- [ ] Add your project manager as collaborator on Github.
- [ ] Clone your OWN version of the repository (Not Lambda's by mistake!).
- [ ] Create a new branch: git checkout -b `<firstName-lastName>`.
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly.
- [ ] Push commits: git push origin `<firstName-lastName>`.
 
Follow these steps for completing your project.

- [ ] Submit a Pull-Request to merge <firstName-lastName> Branch into master (student's  Repo). **Please don't merge your own pull request**
- [ ] Add your project manager as a reviewer on the pull-request
- [ ] Your project manager will count the project as complete by merging the branch back into master.

## Task 2: Set up your preprocessor
* [ ] Verify that you have LESS installed correctly by running `lessc -v` in your terminal, if you don't get a version message back, reach out to your project manager for help.
* [ ] Open your terminal and navigate to your preprocessing project by using the `cd` command
* [ ] Once in your project's root folder, run the following command `less-watch-compiler less css index.less`
* [ ] Verify your compiler is working correctly by changing the `background-color` on the `html` selector to `red`
* [ ] Once you see the red screen, you can delete that style and you're ready to start on the next task

## Task 3: Project Objectives

* [ ] Review the [example resume](resume-example.png).  Notice how simplistic the example resume is.  Develop a simple layout of your choosing. If you are struggling to be creative, you may use the example resume as your design file. 
**Note: you are only required to build one page, anything more than that would be stretch.**
* [ ] The resume content will be provided by you. The content can be about you or a fictional character.  
* [ ] Content: Navigation - Build a simple navigation with 4 items of your choosing
* [ ] Content: Intro - Have a short introduction as to why you would be a good hire
* [ ] Content: Skills - Showcase a list of skills you have somewhere on your resume
* [ ] Content: Work History - Showcase your work history somewhere on your resume
* [ ] Content: Contact - Provide some way a potential employer could contact you.  Phone number, email, or a full on contact form (doesn't have to work)
* [ ] Variables: Incorporate variables in your project for color and font stacks.  
* [ ] Nesting: Every selector should be nested inside the main container.  Avoid having global styles unless they are element level.
* [ ] Mixins: Create 2 mixins of your choosing. Hint: It's super helpful to use flexbox properties in mixins
* [ ] Mobile: Use nested-at rules to provide a mobile version of your resume.  Use `500px` as a `max-width` for mobile. 

## Stretch Goals: 
* [ ] Incorporate a google font of your choosing
* [ ] Convert the great idea CSS into LESS.  Introduce variables, mixins, nesting, etc. 
* [ ] Create a link to the portfolio page and create a layout that would allow users to see your work.  A good idea is to link projects back to their github repos so employers can see your code.



