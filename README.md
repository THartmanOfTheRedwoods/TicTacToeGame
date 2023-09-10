# TicTacToeGame Lab
JavaFX TicTacToeGame for CIS-18 bug training!

## Part 1: Developer Skills

New developers will often be asked to get up to speed on a project rapidly. It is essential that new developers be able to look through code, identify pieces the under-stand, and research pieces they do not. This is an exercise that takes 2 forms, first an introduction to code scanning and review and second as a tool to help you identify areas you need to improve your knowledge of.

1. Fork this repo to your own GitHub Account.
1. Clone your GitHub Account's repo to your local machine.
1. Now, take 15 minutes to get a big picture of the code in this application and its features.
    * Jot down notes here concerning: classes, objects, encapsulation, abstraction, inheritance, and polymorphism (i.e. if they are used, where they occur, etc.).
1. Don’t be stuck for too long, if you don't understand a section jot it down below and move on.
    * Jot down part of the code you don't understand here.
    * I'd like each person to jot down at least 2 things unfamiliar to them.
1. Now Take 5 minutes  and team up with one of your group members and take turns trying to explain what you’ve understood to someone else.
    * Ask if they can answer the items you jotted down in #2.
1. Let's discuss as a class the items you still have questions about or are unfamiliar with.
    * Take notes here of things that became more clear after the class discussion.
1. Commit & Push your README.md notes back to your origin and issue a Pull request to my instructor repo.
1. Submit your Pull request URL to **Developer Skills Lab**


Aidan Higgs CIS-18 week 3 lab:
   1. Notes.
      There are several classes:
         Mian TicTacToe, BoardButton, Player, Sentient, Computer and Player factory
      Objects
         Player 1 and Player 2 are objects of the sentient and or computer classes depending on the configuration of the game.
      Encapsulation:
Like most java code, this application is highly encapsulated, for example it uses getters and setters in the player class "getPlayer()" and "setPlayer()" to access and              modify data instead of directly accessing it to avoid breaking the code.
      Abstraction:
One Example of abstraction in this application is the player class. This class is abstract as it essentially acts as a placeholder for other classes to implement their code, more specifically other classes must provide an implementation. The player class only provides a framework for what needs to be done as in it ensures that every 
          the player must take a turn, keep track of wins etc.
      Inheritance:
The sentient class inherits from the player class, the playTurn() method provides an implementation for the method inherited from the player class that allows for specific logic handling the logic for a player to make a move.
      
         The computer class also inherits all objects from the player class, like the sentient subclass, it also provides logic to the abstract player class, this time handling how             the computer makes a move.
         I made a diagram in mermaid live outlining the inheritance:
            classDiagram
                Player <|.. Sentient : Inheritance
                Player <|.. Computer : Inheritance
                class Player {
                    String name
                    String symbol
                    playTurn()
                    getSymbol()
                }
                class Sentient {
                    playTurn()
                }
                class Computer {
                    playTurn()
                }
      Polymorphism:
In this application, polymorphism shows up in the computer and sentient class as the are both treated as Player objects, within the logic of the game player can reference either the sentient or computer objects and call the playTurn() method, meaning that particular execution of the code is dependant on whether the Player object is being treated as a sentient or computer player.
I also created a mermaid live diagram to help me understand the code better:
	classDiagram
class Game {
start()
end()
checkWinLoss()
}
class Board {
initialize()
display()
}
class Player {
String name
String symbol
playTurn()
}
class Sentient {
playTurn()
}
class Computer {
playTurn()
}
Game --> Board : usses
Game --> Player : Has 2
Player <|-- Sentient : Inheritance
Player <|-- Computer : Inheritance

Notes Pt. 2:
   I do not understand the logic behind how the computer is making moves as I have not encoutnered the MinMax algorithm, in particularwhat exactly the for loop here is doing: for(int r=0; r<board.length; r++) {
            for(int c=0; c<board[r].length; c++) {
   I also do not understand how the getPlayer() method works as I have not encountered switch method before, infact I cannot run this application as my jvm version does not support switch methods and I will need to switch from version 13 to run it.
## Part 2: Demo & Bug Bounty (Not time Sensitive for extra credit)

1. After my in class demonstration, see if you can use the JavaFX knowledge you obtained this week to get the project functioning.
1. Watch the following video on the MiniMax algorithm.
    * <iframe width="560" height="315" src="https://www.youtube.com/embed/l-hh51ncgDI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
1. I've implemented this algorithm in Computer.java for the AI player, BUT I've added a bug that causes the AI to malfunction when it is the minimizing player.
    * If you can find the MiniMax bug, correct it in your Java code, and submit a pull request back to this branch under a **feature branch** called **MiniMaxBug** you can receive a full lab grade.
