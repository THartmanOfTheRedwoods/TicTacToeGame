import javafx.application.Application;

public class Main {

    //This launches the game window application
    public static void main(String[] args) {

        Application.launch(TicTacToe.class, "--size=400", "--squares=3");
    }
}