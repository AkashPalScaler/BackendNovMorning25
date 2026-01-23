package TicTacToe.Strategies.WinnerStrategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface WinnerStrategy {
    Boolean checkWinner(Move move, Board board);
    void undoCountMap(Move move);
}
