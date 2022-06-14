package ticTacToe;

import java.util.Scanner;

public class ticTacToeMain {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();


        int counter = 1;
        Scanner input = new Scanner(System.in);
        while (counter <=9){
            ticTacToe.displayBoard();

            System.out.println("Player One turn");
            int playerOneInput = input.nextInt();
            player1.play(playerOneInput, ticTacToe.getBoard());
            ticTacToe.displayBoard();
            ticTacToe.gameStatus();
            if(ticTacToe.isPlayerOneWin()) {
                System.out.println("Player One wins");
                break;
            }

            System.out.println("Player two turn");
            int playerTwoInput = input.nextInt();
            player2.play(playerTwoInput, ticTacToe.getBoard());
            ticTacToe.gameStatus();
            if(ticTacToe.isPlayertwoWin()) {
                System.out.println("Player two wins");
                break;
            }

            counter++;
            if (ticTacToe.isGameDraw()){
                System.out.println("Game has ended in a draw!!");
            }
        }
    }
}
