package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static GameController gameController = new GameController();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Player player1 = new HumanPlayer("Akash", PlayerType.HUMAN, new Symbol('X'), 30);
        Player player2 = new BotPlayer("Botty", PlayerType.BOT, new Symbol('O'), BotPlayerDifficultyLevel.EASY);

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        List<WinnerStrategyType> winnerStrategyTypes = new ArrayList<>();
        winnerStrategyTypes.add(WinnerStrategyType.ROW);
        winnerStrategyTypes.add(WinnerStrategyType.COLUMN);

        Game game1 = gameController.startGame(3, players, winnerStrategyTypes);
        Game game2 = gameController.startGame(3, players, winnerStrategyTypes);
        System.out.println("The game has started");
        while(gameController.getState(game1).equals(GameState.IN_PROGRESS)){
            gameController.display(game1);
            gameController.makeNextMove(game1);
            gameController.display(game1);

            System.out.println("If you want to undo, please press 1 else press 2: ");
            int input = sc.nextInt();
            if(input == 1){
                gameController.undo(game1);
            }
        }

        if(gameController.getState(game1).equals(GameState.ENDED_WITH_WIN)){
            System.out.println(gameController.getWinner(game1).getName() + " wins the game!");
        }else{
            System.out.println("The game is draw!");
        }

    }
}
// Break till 8:25 AM