package ticTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticTacToe.Value.*;

public class TicTacToeTest{
    private  TicTacToe tictactoe;
    private Player1 player1;
    private Player2 player2;
    @BeforeEach
    public void setUp(){
        tictactoe = new TicTacToe();
        player1 = new Player1();
        player2 = new Player2();
    }
    @Test
    public void thatTicTacToeCanBeCreated(){
        assertNotNull(tictactoe);
    }
    @Test
    public void thatTicTacToeHasAnArrayTest(){
        int rowLength = tictactoe.getArrayRow();
        int columnLength = tictactoe.getArrayColumn();
        assertEquals(3,rowLength);
        assertEquals(3,columnLength);

    }
    @Test
    public void ticTacToeBoardIsEmptyUponConstructionTest(){
        Value empty = tictactoe.getElementsAt(1);
        assertEquals(EMPTY,empty);
        assertEquals(EMPTY,tictactoe.getElementsAt(2));
        assertEquals(EMPTY,tictactoe.getElementsAt(3));
        assertEquals(EMPTY,tictactoe.getElementsAt(4));
        assertEquals(EMPTY,tictactoe.getElementsAt(5));
        assertEquals(EMPTY,tictactoe.getElementsAt(6));
        assertEquals(EMPTY,tictactoe.getElementsAt(7));
        assertEquals(EMPTY,tictactoe.getElementsAt(8));
        assertEquals(EMPTY,tictactoe.getElementsAt(9));
    }

    @Test
    public void tictactoeHasTwoPlayersTest(){
        assertEquals(Player1.class, tictactoe.getPlayer1Class());
        assertEquals(Player2.class, tictactoe.getPlayer2Class());
    }



    @Test
    public void thatPLayersCanPlayOnTheBoardTest(){
        Value[][] board = tictactoe.getBoard();
        player1.play(1, board);
        player2.play(2, board);
        assertEquals(X, tictactoe.getElementsAt(1));
        assertEquals(O, tictactoe.getElementsAt(2));



    }
    @Test
    public void thatPlayer1CanPlayOnAllTheBoardTest(){
     Value[][] board = tictactoe.getBoard();
     player1.play(1,board);
     player1.play(2,board);
     player1.play(3,board);
     player1.play(4,board);
     player1.play(5,board);
     player1.play(6,board);
     player1.play(7,board);
     player1.play(8,board);
     player1.play(9,board);
     assertEquals(X, tictactoe.getElementsAt(1));
     assertEquals(X, tictactoe.getElementsAt(2));
     assertEquals(X, tictactoe.getElementsAt(3));
     assertEquals(X, tictactoe.getElementsAt(4));
     assertEquals(X, tictactoe.getElementsAt(5));
     assertEquals(X, tictactoe.getElementsAt(6));
     assertEquals(X, tictactoe.getElementsAt(7));
     assertEquals(X, tictactoe.getElementsAt(8));
     assertEquals(X, tictactoe.getElementsAt(9));
    }
    @Test
    public void thatPlayer2CanPlayOnAllTheBoardTest(){
        Value[][] board = tictactoe.getBoard();
        player2.play(1,tictactoe.getBoard());
        player2.play(2,board);
        player2.play(3,board);
        player2.play(4,board);
        player2.play(5,board);
        player2.play(6,board);
        player2.play(7,board);
        player2.play(8,board);
        player2.play(9,board);
        assertEquals(O,tictactoe.getElementsAt(1));
        assertEquals(O,tictactoe.getElementsAt(2));
        assertEquals(O,tictactoe.getElementsAt(3));
        assertEquals(O,tictactoe.getElementsAt(4));
        assertEquals(O,tictactoe.getElementsAt(5));
        assertEquals(O,tictactoe.getElementsAt(6));
        assertEquals(O,tictactoe.getElementsAt(7));
        assertEquals(O,tictactoe.getElementsAt(8));
        assertEquals(O,tictactoe.getElementsAt(9));
    }
    @Test
    public void playerCanOnlyPlayOnAnEmptySquareTest(){
        player1.play(1, tictactoe.getBoard());
        player2.play(2, tictactoe.getBoard());
        player1.play(2, tictactoe.getBoard());
        player2.play(1, tictactoe.getBoard());
        assertEquals(X, tictactoe.getElementsAt(1));
        assertEquals(O, tictactoe.getElementsAt(2));
    }

    @Test
    public void playerOneCanWinIf_PositionOneTwoThreeIsPlayedOnTest(){
        player1.play(1, tictactoe.getBoard());
        player1.play(2, tictactoe.getBoard());
        player1.play(3, tictactoe.getBoard());
        tictactoe.gameStatus();
        assertTrue(tictactoe.isPlayerOneWin());
    }

    @Test
    public void playerOneCanWinIf_PositionFourFiveSixIsPlayedOnTest(){
        player1.play(4, tictactoe.getBoard());
        player1.play(5, tictactoe.getBoard());
        player1.play(6, tictactoe.getBoard());
        tictactoe.gameStatus();
        assertTrue(tictactoe.isPlayerOneWin());
    }

    @Test
    public void playerOneCanWinIf_PositionSevenEightNineIsPlayedOnTest(){
        player1.play(7, tictactoe.getBoard());
        player1.play(8, tictactoe.getBoard());
        player1.play(9, tictactoe.getBoard());
        tictactoe.gameStatus();
        assertTrue(tictactoe.isPlayerOneWin());
    }
    @Test
    public void playerOneCanWinIf_PositionOneFourSevenIsPlayedOnTest(){
        player1.play(1, tictactoe.getBoard());
        player1.play(4, tictactoe.getBoard());
        player1.play(7, tictactoe.getBoard());
        tictactoe.gameStatus();
        assertTrue(tictactoe.isPlayerOneWin());
    }
    @Test
    public void playerOneCanWinIf_PositionThreeSixNineIsPlayedOnTest() {
        player1.play(3, tictactoe.getBoard());
        player1.play(6, tictactoe.getBoard());
        player1.play(9, tictactoe.getBoard());
        tictactoe.gameStatus();
        assertTrue(tictactoe.isPlayerOneWin());
    }
    @Test
    public void playerOneCanWinIf_PositionOneFiveNineIsPlayedOnTest() {
        player1.play(1, tictactoe.getBoard());
        player1.play(5, tictactoe.getBoard());
        player1.play(9, tictactoe.getBoard());
        tictactoe.gameStatus();
        assertTrue(tictactoe.isPlayerOneWin());
    }
    @Test
    public void playerOneCanWinIf_PositionThreeFiveSevenIsPlayedOnTest() {
        player1.play(3, tictactoe.getBoard());
        player1.play(5, tictactoe.getBoard());
        player1.play(7, tictactoe.getBoard());
        tictactoe.gameStatus();
        assertTrue(tictactoe.isPlayerOneWin());
    }
        @Test
        public void playerOneCanWinIf_PositionTwoFiveEightIsPlayedOnTest() {
            player1.play(2, tictactoe.getBoard());
            player1.play(5, tictactoe.getBoard());
            player1.play(8, tictactoe.getBoard());
            tictactoe.gameStatus();
            assertTrue(tictactoe.isPlayerOneWin());
        }


            @Test
            public void playerTwoCanWinIf_PositionOneTwoThreeIsPlayedOnTest () {
                player2.play(1, tictactoe.getBoard());
                player2.play(2, tictactoe.getBoard());
                player2.play(3, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());
            }

            @Test
            public void playerTwoCanWinIf_PositionFourFiveSixIsPlayedOnTest () {
                player2.play(4, tictactoe.getBoard());
                player2.play(5, tictactoe.getBoard());
                player2.play(6, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());
            }


            @Test
            public void playerTwoCanWinIf_PositionSevenEightNineIsPlayedOnTest () {
                player2.play(7, tictactoe.getBoard());
                player2.play(8, tictactoe.getBoard());
                player2.play(9, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());
            }
            @Test
            public void playerTwoCanWinIf_PositionOneFourSeven () {
                player2.play(1, tictactoe.getBoard());
                player2.play(4, tictactoe.getBoard());
                player2.play(7, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());

            }
            @Test
            public void playerTwoCanWinIf_PositionOneFiveNine () {
                player2.play(1, tictactoe.getBoard());
                player2.play(5, tictactoe.getBoard());
                player2.play(9, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());
            }
            @Test
            public void playerTwoCanWinIf_PositionThreeFiveSeven () {
                player2.play(3, tictactoe.getBoard());
                player2.play(5, tictactoe.getBoard());
                player2.play(7, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());
            }
            @Test
            public void playerTwoCanWinIf_PositionTwoFiveEightIsPlayedOnTest(){
                player2.play(2, tictactoe.getBoard());
                player2.play(5, tictactoe.getBoard());
                player2.play(8, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());
    }
            @Test
            public void playerTwoCanWinIf_PositionThreeSixNIneIsPlayedOnTest() {
                player2.play(3, tictactoe.getBoard());
                player2.play(6, tictactoe.getBoard());
                player2.play(9, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isPlayertwoWin());
            }
            @Test
            public void gameCanEndInAdrawTest(){
                player1.play(1, tictactoe.getBoard());
                player2.play(2, tictactoe.getBoard());
                player1.play(5, tictactoe.getBoard());
                player2.play(3, tictactoe.getBoard());
                player1.play(6, tictactoe.getBoard());
                player2.play(4, tictactoe.getBoard());
                player1.play(7, tictactoe.getBoard());
                player2.play(9, tictactoe.getBoard());
                player1.play(8, tictactoe.getBoard());
                tictactoe.gameStatus();
                assertTrue(tictactoe.isGameDraw());
            }
    }
