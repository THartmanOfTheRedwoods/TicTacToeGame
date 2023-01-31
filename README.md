# TicTacToeGame Lab
JavaFX TicTacToeGame for CIS-18 bug training!

## Part 1: Developer Skills

TicTacToe.java
* TicTacToe is an extension of JavaFX application, inherits stuff from it
* TicTacToe is called from program main entry point - confusion resolved

Boardbutton.java
* Import scene control button from JavaFX
* BoardButton an extension of vanilla imported Button class?

Computer.java
* Import application platform + scene node from JavaFX
* Superclass? name, marker, turn - what is this? still curious to learn more about sub/super
* Override takeTurn function for AI player
* AI checks for ties as part of optimal turn-making - confusion resolved
* Then it escapes my knowledge of Java at this point lmao
* i see bits about “fake placing” a square to test moves before making one - minimax function

Main.java
* Main class
* Launches application with size modifier set to 400, and as a 3x3 square (a typical tic-tac-toe board)

Player.java
* Initialize variables name, marker, number of wins (at 0), turn number, then assigns them to the player object
* getName(), getMarker(), getTurn() etc. all update player’s info as the game goes on (i see this referenced in other files)

PlayerFactory.java
* Labels players as “COMPUTER”or “SENTIENT”, and assigns labels to respective objects.

Sentient.java
* Sentient player object is an extension of the vanilla player object?
* Override takeTurn method for the sentient player, different from bot - confusion resolved


