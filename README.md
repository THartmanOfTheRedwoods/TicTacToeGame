# CIS-18 Lab 3 "Developer Skills" Writeup

Main.java:
	IMPORT JavaFX {}
	MAIN {
		access public
		membership static (static method)
		return void (no return value)
		name main
		args string (size of squares, number of squares for grid)
		app launch (launches the TicTacToe application)
	}

TicTacToe.java:
	GAME {
	access public
	type class_inherited
	family Application (super)
	name TicTacToe
	vars * (initalizes a bunch of important variables and elements)
	}
	INIT {
	access public
	return void
	relation EXCEPTION (probably related to error handling)
	name init
	vars * (parameters)
	}
	START {
	access public
	return void
	element (sets window size and creates menus)
	name start
	}
	VBOX {
         # I'm not even touching this..., or the rest of the file for that matter.
         # I understand some basic interactions but the rest feels beyond me at the moment.
	}

Computer.java:
	IMPORT JavaFX {}
	COMPUTER {
		access public
		name computer
		parent PLAYER
		type object (?)
		args */*/* [super */*/*] (takes name, marker, turn from parent class PLAYER)
		constraint override (child method declaration overrides parent method declaration)
	}
	TAKE_TURN {
		access public
		name takeTurn
		return void (no return value)
		args TicTacToe_game (__UNKNOWN__)
		comment code_outerloop (code referenced from BoardButton.java)
		element javafx_node { type abstract_class (creates blueprint for game board) }
		int var_score (initializes score variable with lowest possible value an iteger can have)
		function int_move (takes an integer in a supplied register and copies it as an integer to a new register? __UNKNOWN__)
		loop for_int {multiline summary (does something with simulating player choices) }
		element platform.runlater (does something)
	}
	SPACING {
		access private
		name spacing
		type String
		args int
		elements (updates the depth)
	}
	CHECKTIE {
		access private
		name checktie
		type boolean
		args Node_object
		loop node.board (checks if all squares are empty to see if game is over)
	}
	MINIMAX {
		access private
		name minimax
		type int
		args ***
		element *** (checks for winning move/winning player, repeats simulation based on loop conditions)

BoardButton.java:
	BOARDBUTTON {
		access public
		name boardbutton
		type class_inherited
		family Button (super)
		element int (coordinates)
		object BoardButton (dunno)
		int column
		int row
		boolean (square availability)
	}

PlayerFactory.java:
    PLAYER_FACTORY {
        access public
        constraint PLAYER_TYPES
		method get_player
		object PLAYER
    }
        PLAYER_TYPES {
            access public
			membership static
			create object (creates computer and sentient players, locks player names)
			recursive call, return (sets name of player to the defined label and returns labels)
        }
        PLAYER {
			access public
			name get_player
			type object (method)
			args playerType
			args name (string)
			args marker (string, __UNKNOWN__)
			int turn
			code return (returns computer and sentient (human?) playertypes with updated turns)
		}
