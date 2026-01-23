package TicTacToe.Strategies.BotPlayerStrategy;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;
import TicTacToe.Models.Player;
import TicTacToe.Validations.MoveValidation;

public interface BotPlayerStrategy {
    Move makeMove(Board board, Player player);
}
