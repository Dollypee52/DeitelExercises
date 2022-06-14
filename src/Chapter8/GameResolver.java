package Chapter8;

public class GameResolver {

    public static boolean areThreePiecesInLIne(int[][] board, int row, int col) {

        int gamePiece = board[row][col];
        if (gamePiece == 0) return false;
        //DOWN DIRECTION
        boolean isCellOutOfBoard = (row + 1 > board.length - 1 || row + 2 > board.length - 1);
        if (!isCellOutOfBoard && board[row + 1][col] == gamePiece && board[row + 2][col] == gamePiece) {
            return true;
        }
        //UP DIRECTION
        isCellOutOfBoard = (row - 1 < 0);
        if (!isCellOutOfBoard && (board[row - 1][col] == gamePiece)) {
            isCellOutOfBoard = (row - 2 < 0);
            if (!isCellOutOfBoard && (board[row - 2][col] == gamePiece)) {
                return true;
            }
        }
        isCellOutOfBoard = (row - 1 < 0);
        if (!isCellOutOfBoard && (board[row][col - 1] == gamePiece)) {
            isCellOutOfBoard = (col - 2 < 0);
            if (!isCellOutOfBoard && (board[row][col - 2] == gamePiece)) {
                return true;
            }
        }
        //LEFT UP DIRECTION
        isCellOutOfBoard = (row - 1 < 0) || (col - 1 < 0);
        if (!isCellOutOfBoard && (board[row - 1][col - 1] == gamePiece)) {
            isCellOutOfBoard = (row - 2 < 0) || (col - 2 < 0);
            if (!isCellOutOfBoard && (board[row - 2][col - 2] == gamePiece)) {
                return true;


            }
        }
        return false;
    }
    public enum GameState{IN_PROGRESS, X_WON, O_WON;}

    public static GameState resolve(int[][] board){
        // for every cell
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){

                boolean threeConsecutiveCells = areThreePiecesInLIne(board, row,col);
                if(threeConsecutiveCells){
                    if(board[row][col] ==1) return GameState.X_WON;
                    else return GameState.O_WON;
                }
            }
        }
        return GameState.IN_PROGRESS;
    }
}

