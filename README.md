# TicTacToeGame Lab
JavaFX TicTacToeGame for CIS-18 bug training!

## Part 1: Developer Skills

New developers will often be asked to get up to speed on a project rapidly. It is essential that new developers be able to look through code, identify pieces the under-stand, and research pieces they do not. This is an exercise that takes 2 forms, first an introduction to code scanning and review and second as a tool to help you identify areas you need to improve your knowledge of.

1. Fork this repo to your own GitHub Account.
1. Clone your GitHub Account's repo to your local machine.
1. Now, take 15 minutes to get a big picture of the code in this application and its features.
    * Jot down notes here concerning: classes, objects, encapsulation, abstraction, inheritance, and polymorphism (i.e. if they are used, where they occur, etc.).
    * The computer class is concerning to me, I know it represents a player. An AI. It inherits from the player class.
    * The class uses encapsulated methods like spacing, checkTie and minimax. The takeTurn method uses abstraction by calling the method but not showing all of the code.
   The takeTurn method also uses polymorphism by being overridden in the computer class
1. Don’t be stuck for too long, if you don't understand a section jot it down below and move on.
    * Jot down part of the code you don't understand here.
    * Node[][] board = game.getBoard();
    * I'm confused on what the Node command does.
    * Platform.runLater(((BoardButton)board[move[0]][move[1]])::fire);
    * I also do not understand the platform.runlater code
    * I'd like each person to jot down at least 2 things unfamiliar to them.
1. Now Take 5 minutes  and team up with one of your group members and take turns trying to explain what you’ve understood to someone else.
    * Ask if they can answer the items you jotted down in #2.
1. Let's discuss as a class the items you still have questions about or are unfamiliar with.
    * Take notes here of things that became more clear after the class discussion.
1. Commit & Push your README.md notes back to your origin and issue a Pull request to my instructor repo.
1. Submit your Pull request URL to **Developer Skills Lab**

## Part 2: Demo & Bug Bounty (Not time Sensitive for extra credit)

1. After my in class demonstration, see if you can use the JavaFX knowledge you obtained this week to get the project functioning.
1. Watch the following video on the MiniMax algorithm.
    * <iframe width="560" height="315" src="https://www.youtube.com/embed/l-hh51ncgDI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
1. I've implemented this algorithm in Computer.java for the AI player, BUT I've added a bug that causes the AI to malfunction when it is the minimizing player.
    * If you can find the MiniMax bug, correct it in your Java code, and submit a pull request back to this branch under a **feature branch** called **MiniMaxBug** you can receive a full lab grade.
