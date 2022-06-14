package ticTacToe;

import static ticTacToe.Value.EMPTY;

public class Player2 implements Player {
    public void play(int position, Value[][] board) {
        if(getBoardElement(position, board) == EMPTY)
            if(position == 1) board[0][0] = Value.O;
            else if (position == 2)  board[0][1] = Value.O;
            else if (position == 3)  board[0][2] = Value.O;
            else if (position == 4) board[1][0] = Value.O;
            else if (position == 5)  board[1][1] = Value.O;
            else if (position == 6)  board[1][2] = Value.O;
            else if (position == 7)  board[2][0] = Value.O;
            else if (position == 8)  board[2][1] = Value.O;
            else if (position == 9)  board[2][2] = Value.O;
        }
        private Value getBoardElement(int position, Value[][] board){
        if(position == 1) return board[0][0];
        else if(position == 2) return board[0][1];
        else if(position == 3) return board[0][2];
        else if(position == 4) return board[1][0];
        else if(position == 5) return board[1][1];
        else if(position == 6) return board[1][2];
        else if(position == 7) return board[2][0];
        else if(position == 8) return board[2][1];
        else if(position == 9) return board[2][2];
        return null;
    }
}

