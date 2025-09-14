NOTES ABOUT WHAT I UNDERSTOOD - Travis Benedict
In the SRC folder we have, 

BoardButton.java
This file imports javaFx
it extends an interface named button, and it sets up how this object needs to interact with the program. it returns info for the coordinate

Computer.java
This is the most indepth object and i feel like im way out of my depth here, my team is similar. What i do understand is. This reads the board state(check for spot ocupation, player count,turn order and ties), tries itterations on the board until it uses minmax to find the best move.

Main.java
This launches the aplication ticktactoe class

Player.java
takes input from the player, and gives turn.

PlayerFactory.java
This adds players to the game instance.

Sentient.java
This extends player,

TicTacToe.java
This imports all the libraries and extends aplication so it is the main aplication game object. it has all the renders,print-outs, and organization of parts needed to have the game show on screen in the aplication window(It creates the board),it also decides the winner!

## Part 2: Demo & Bug Bounty (Not time Sensitive for extra credit)

1. After my in class demonstration, see if you can use the JavaFX knowledge you obtained this week to get the project functioning.
1. Watch the following video on the MiniMax algorithm.
    * <iframe width="560" height="315" src="https://www.youtube.com/embed/l-hh51ncgDI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
1. I've implemented this algorithm in Computer.java for the AI player, BUT I've added a bug that causes the AI to malfunction when it is the minimizing player.
    * If you can find the MiniMax bug, correct it in your Java code, and submit a pull request back to this branch under a **feature branch** called **MiniMaxBug** you can receive a full lab grade.
