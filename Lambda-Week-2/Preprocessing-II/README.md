# Preprocessing II: Fun Bus Website

Fun Bus is a travel agency looking for some help on their website.  They want a new navigation, new header, and new buttons on the home page. They also want a mobile version of their site styled.  Use your preprocessing knowledge to accomplish their tasks.

## Task 1: Set Up The Project With Git

- [ ] Create a forked copy of this project.
- [ ] Add your team lead as collaborator on Github.
- [ ] Clone your OWN version of the repository (Not Lambda's by mistake!).
- [ ] Create a new branch: git checkout -b `<firstName-lastName>`.
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly.
- [ ] Push commits: git push origin `<firstName-lastName>`.
 
Follow these steps for completing your project.

- [ ] Submit a Pull-Request to merge <firstName-lastName> Branch into master (student's  Repo). **Please don't merge your own pull request**
- [ ] Add your team lead as a reviewer on the pull-request
- [ ] Your team lead will count the project as complete by merging the branch back into master.

## Task 2: Set up your preprocessor
* [ ] Verify that you have LESS installed correctly by running `lessc -v` in your terminal, if you don't get a version message back, reach out to your team lead for help.
* [ ] Open your terminal and navigate to your preprocessing project by using the `cd` command
* [ ] Once in your project's root folder, run the following command `less-watch-compiler less css index.less`
* [ ] Verify your compiler is working correctly by changing the `background-color` on the `html` selector to `red` in your `index.less` file.
* [ ] Once you see the red screen, you can delete that style and you're ready to start on the next task

## Task 3: Import LESS Files

* [ ] Navigate to your `index.less` file. Notice the file is blank.  In order for you to see the styles for this project you must import them in a certain order.  That order is as follows:

1. `variables.less`
2. `mixins.less`
3. `reset.less`
4. `global.less`
5. `navigation.less`
6. `footer.less`
7. `home-page.less`


## Task 4: Desktop Updates Needed
* [ ] Review the [desktop design file](design-files/fun-bus-desktop.png).  Notice the navigation, header, and buttons at the bottom of the page are missing.
* [ ] Navigation: Use the `navigation.less` file for all your navigation styling
* [ ] Main Header: Use the `home-page.less` file for the header styling.
* [ ] Buttons: Create a parametric mixin that can create the missing buttons in the design file. Use the `mixins.less` file to create your mixin.


## Task 5: Mobile Updates Needed
* [ ] Use escaping to create a variable named `@mobile` that contains this value: `(max-width: 500px)`.  Use the `variables.less` file to house your variables.
* [ ] Review the [mobile design file](design-files/fun-bus-mobile.png). You will see several design updates that need updating. 
* [ ] Match the design file at `500px` as well as you can 

## Stretch Goals: 
* [ ] Create an animation mixin using parametric mixins
* [ ] Introduce a form with inputs allowing users to select a vacation package and a submit button at the bottom of the page. Introduce inputs for name, email, phone number, and an area for them to leave special instructions. 
* [ ] Style the site to look good at all sizes, not just desktop and phone



