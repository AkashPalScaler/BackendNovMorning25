package TicTacToe.Validations;

import TicTacToe.Models.Board;
import TicTacToe.Models.CellState;
import TicTacToe.Models.Move;

public class MoveValidation {
    public static boolean validMove(Move move, Board board){
        int row = move.getCell().getRow();
        int col= move.getCell().getCol();

        if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()){
            System.out.println("Invalid Input.\n Please enter the row and column again:");
            return false;
        }

        if(board.getGrid().get(row).get(col).getCellState().equals(CellState.OCCUPIED)){
            System.out.println("Invalid Input.\n Please enter the row and column again:");
            return false;
        }
        return true;
    }
}
