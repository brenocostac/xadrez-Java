package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class ChessApplication {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        
        while(true) {
        	try {
	        	UiBoard.clearScreen();
	        	UiBoard.printBoard(chessMatch.getPieces());
	        	System.out.println();
	        	System.out.print("Source: ");
	        	ChessPosition source = UiBoard.readChessPosition(sc);
	        	
	        	System.out.println();
	        	System.out.print("Target: ");
	        	ChessPosition target = UiBoard.readChessPosition(sc);
	        	
	        	ChessPiece capturedPiece = chessMatch.performChessMovie(source, target);
        	}
        	catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
        	catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
        	 
        }
         
         
        
    }
}
