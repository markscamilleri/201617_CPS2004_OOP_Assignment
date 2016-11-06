# CPS2004 Assignment [![Build Status](https://travis-ci.com/markscamilleri/201617_CPS2004_OOP_Assignment.svg?token=npXrSaqtXLCYdQdEQHQQ&branch=master)](https://travis-ci.com/markscamilleri/201617_CPS2004_OOP_Assignment)
## Team Name: Programmers Semi-Sura

## Team Members
Name                | Role    | GitHub Username
--------------------|---------|----------------
Mark Said Camilleri | Engine  | @markscamilleri
Miguel Dingli       | Player  | @Miguel206
Ella Lautier        | Player  | @ellalautier

## Coding
Firstly, to create the project on your chosen IDE, remember to use "Create project with existing sources". That way, you can select this repository to be where your sources are located. Source code will go in the `src` folder, whereas the compiled code will go in the `dist` folder. Code pertaining to unit tests should go to the `test` folder.

Javadocs are there for a reason, they can produce very pretty documentation pages :smiley:

## Code Formatting
One of the best ways to write clean code is by making sure that your code adhers to a specific format. Google has made available their own code style formatting avaialable for anyone to use (https://github.com/google/google-java-format). Apart from this, IntelliJ (and I believe also, Eclipse) have got this plugin called SonarLint which would alert you whenever your code does not adher to the style you choose. 

## Compilation
As @jp-uom said in [his repository](https://github.com/jp-uom/201617_CPS2004_OOP_Assignment), compilation should be done by downloading the `jar` file and using the following command:

    javac -classpath tttwar_v1.0.jar JPJeegRobotDAcciaio.java

So remember to configure your IDE accordingly if you're using an IDE.

## Git Branching
The aim of the `master` branch is to always contain a working copy of the programme that is developed. As a result, whenever something is to be coded, it should be done by branching out from the `master` branch into your own branch, and then merging back to the `master` branch. To merge back, the code must be tested and it must work [see Testing](#Testing). Normally, pull requests are used for code reviews, that is when someone else reviews your code for you. This allows to have a second pair of eyes looking at your code to detect bugs. However, due to the nature of this assignment of having players' code secret, this will not happen that way. Instead, pull requests will just be used to wait for Travic CI to make sure that the code works.

### Some useful links to git:
- https://git-scm.com/ - Git Documentation
- http://learngitbranching.js.org/ - Git CLI tutorial

## Testing
Unit Testing is useful since we can test our methods in an isolated fashion, automatically. This would be tested upon building the system and thus can also be done by the Continouous Integration tool [see Continuous Integration](#Continuous-Integration) to automate this and enforce the *working copy master branch* policy.

As a result, it is best to have methods tested using Unit Testing. This shall be done using [JUnit](http://junit.org/). I have added a simple test to my class so that you can see what it looks like. The point is to have Travis run these tests to make sure that the methods work as we expect them to work, and we would also be able to ensure that the `master` branch only has a working copy of the program.

## Continuous Integration 
Continuous Integration allows us to automate certian stuff, such as checking whether the program is broken to even deploying the system. In our case, we would be using it to make sure that the program builds properly before merging the branch it lies on back to the `master` branch. That way, we can ensure that whatever is on the `master` branch would be compilable. It is also ideal to test programs and this can be automated using CI too.

CI results for this assignment can be seen here: https://travis-ci.com/markscamilleri/201617_CPS2004_OOP_Assignment
