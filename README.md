# TicTacToeGame Lab
JavaFX TicTacToeGame for CIS-18 bug training!

## Part 1: Developer Skills

New developers will often be asked to get up to speed on a project rapidly. It is essential that new developers be able to look through code, identify pieces the under-stand, and research pieces they do not. This is an exercise that takes 2 forms, first an introduction to code scanning and review and second as a tool to help you identify areas you need to improve your knowledge of.

1. Fork this repo to your own GitHub Account.
1. Clone your GitHub Account's repo to your local machine.
1. Now, take 15 minutes to get a big picture of the code in this application and its features.
    * Jot down notes here concerning: classes, objects, encapsulation, abstraction, inheritance, and polymorphism (i.e. if they are used, where they occur, etc.).
      * Main: Launches the program in an application window, which runs the TicTacToe class.
      * TicTacToe: imports javafx libraries, extends application params with some modifications, contains many classes for general game handling, i.e. start, startover, play, checkwinner, etc.
      * BoardButton: Looks like it tries to see if a certain block is available to become a button (If a square has been pressed, it cannot be pressed again/unavailable).
      * Player: Allows creation of Player object, with get methods and a set method for adding wins.
      * PlayerFactory: Creates enum of player types, provides a simple get method.
      * Sentient: Extension of player for sentient players.
      * Computer: Allows creation of Computer object. Contains algorithms to calculate the next move, AI class.
1. Don’t be stuck for too long, if you don't understand a section jot it down below and move on.
    * Jot down part of the code you don't understand here.
    * I'd like each person to jot down at least 2 things unfamiliar to them.
      * I don't recognize the super() keyword (line 7 BoardButton.java), it seems to reference the parent object.
      * I'm not familiar with the functionality of the JavaFX Application class, but from the looks of it, it runs the program as an application in a custom-sized window.
1. Now Take 5 minutes  and team up with one of your group members and take turns trying to explain what you’ve understood to someone else.
    * Ask if they can answer the items you jotted down in #2.
      * Super references the parent object/constructor.
1. Let's discuss as a class the items you still have questions about or are unfamiliar with.
    * Take notes here of things that became more clear after the class discussion.
      * You can enumerate static objects for uses like properties lists.
1. Commit & Push your README.md notes back to your origin and issue a Pull request to my instructor repo.
1. Submit your Pull request URL to **Developer Skills Lab**

## Part 2: Demo & Bug Bounty (Not time Sensitive for extra credit)

1. After my in class demonstration, see if you can use the JavaFX knowledge you obtained this week to get the project functioning.
1. Watch the following video on the MiniMax algorithm.
    * <iframe width="560" height="315" src="https://www.youtube.com/embed/l-hh51ncgDI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
1. I've implemented this algorithm in Computer.java for the AI player, BUT I've added a bug that causes the AI to malfunction when it is the minimizing player.
    * If you can find the MiniMax bug, correct it in your Java code, and submit a pull request back to this branch under a **feature branch** called **MiniMaxBug** you can receive a full lab grade.
