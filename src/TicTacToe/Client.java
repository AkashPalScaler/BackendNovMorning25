package TicTacToe;

import TicTacToe.Models.Game;
import TicTacToe.Models.HumanPlayer;
import TicTacToe.Models.Player;
import TicTacToe.Models.WinnerStrategyType;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer();
        Player player2 = new HumanPlayer();

        Game game = Game.getBuilder()
                .setSize(3)
                .setWinnerStrategyTypes(List.of(WinnerStrategyType.ROW, WinnerStrategyType.COLUMN))
                .setPlayers(List.of(player1, player2))
                .build();
    }
}
