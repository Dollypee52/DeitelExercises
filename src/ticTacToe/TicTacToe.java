package ticTacToe;


import static ticTacToe.Value.*;

public class TicTacToe {
    private Value[][] board = new Value[3][3];
    private Player1 player1 = new Player1();
    private Player2 player2 = new Player2();
    private boolean isPlayerOneWin;
    private boolean isPlayertwoWin;
    private boolean isDraw;


    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public int getArrayRow() {
        return board.length;
    }

    public int getArrayColumn() {
        return board[0].length;
    }


    public Value getElementsAt(int position) {
        if (position == 1) return board[0][0];
        else if (position == 2) return board[0][1];
        else if (position == 3) return board[0][2];
        else if (position == 4) return board[1][0];
        else if (position == 5) return board[1][1];
        else if (position == 6) return board[1][2];
        else if (position == 7) return board[2][0];
        else if (position == 8) return board[2][1];
        else if (position == 9) return board[2][2];

        return EMPTY;
    }

    public Class<? extends Player1> getPlayer1Class() {
        return player1.getClass();
    }

    public Class<? extends Player2> getPlayer2Class() {
        return player2.getClass();
    }

    public Value[][] getBoard() {
        return board;
    }


    public boolean isPlayerOneWin() {
        return isPlayerOneWin;
    }

    public void gameStatus() {
            isPlayerOneWinSetter();
            isPlayerTwoWinSetter();
            isDraw();

    }

    private void isDraw() {
        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[i].length; j++){
              if(board[i][j]==EMPTY) break;
            }
        }
        if(!isPlayerOneWin && !isPlayertwoWin) isDraw = true;
    }

    private void isPlayerTwoWinSetter() {
        if (board[0][0] == O && board[0][1] == O && board[0][2] == O) isPlayertwoWin = true;
        else if (board[1][0] == O && board[1][1] == O && board[1][2] == O) isPlayertwoWin = true;
        else if (board[2][0] == O && board[2][1] == O && board[2][2] == O) isPlayertwoWin = true;
        else if (board[0][0] == O && board[1][1] == O && board[2][2] == O) isPlayertwoWin = true;
        else if (board[0][2] == O && board[1][1] == O && board[2][0] == O) isPlayertwoWin = true;
        else if (board[0][0] == O && board[1][0] == O && board[2][0] == O) isPlayertwoWin = true;
        else if (board[0][1] == O && board[1][1] == O && board[2][1] == O) isPlayertwoWin = true;
        else if (board[0][2] == O && board[1][2] == O && board[2][2] == O) isPlayertwoWin = true;
    }

    private void isPlayerOneWinSetter() {
        if (board[0][0] == X && board[0][1] == X && board[0][2] == X) isPlayerOneWin = true;
        else if (board[1][0] == X && board[1][1] == X && board[1][2] == X) isPlayerOneWin = true;
        else if (board[2][0] == X && board[2][1] == X && board[2][2] == X) isPlayerOneWin = true;
        else if (board[0][0] == X && board[1][1] == X && board[2][2] == X) isPlayerOneWin = true;
        else if (board[0][2] == X && board[1][1] == X && board[2][0] == X) isPlayerOneWin = true;
        else if (board[0][0] == X && board[1][0] == X && board[2][0] == X) isPlayerOneWin = true;
        else if (board[0][1] == X && board[1][1] == X && board[2][1] == X) isPlayerOneWin = true;
        else if (board[0][2] == X && board[1][2] == X && board[2][2] == X) isPlayerOneWin = true;
    }

    public boolean isPlayertwoWin() {
            return isPlayertwoWin;
        }

    public boolean isGameDraw() {
        return isDraw;
    }

    public void displayBoard() {
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
