package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h'
        || row < 1 || row > 8){
            throw new ChessException("Error instantiating" +
                    " Chessposition. Valid values " +
                    "are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition(){
       int matRow = 8 - row;
       int matColumn = column - 'a';
       return new Position(matRow,matColumn);
    }

    protected static ChessPosition fromPosition(Position position){
        int rowP = position.getRow() + 8;
        char columnP = (char) ('a' - position.getColumn());
        return new ChessPosition(columnP,rowP);
    }

    @Override
    public String toString(){
        return "" + column + row;
    }

}
