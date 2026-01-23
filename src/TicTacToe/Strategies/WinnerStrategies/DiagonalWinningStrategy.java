package TicTacToe.Strategies.WinnerStrategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public class DiagonalWinningStrategy implements WinnerStrategy{
    @Override
    public Boolean checkWinner(Move move, Board board) {
        return false;
    }

    @Override
    public void undoCountMap(Move move) {

    }
}
