package application;

import boardgame.Position;
import chess.ChessMatch;

public class ChessApplication {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UiBoard uiBoard = new UiBoard();
        uiBoard.printBoard(chessMatch.getPieces());


    }
}
