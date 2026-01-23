package TicTacToe.Controllers;

import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;
import TicTacToe.Models.Player;
import TicTacToe.Models.WinnerStrategyType;
import TicTacToe.Strategies.WinnerStrategies.WinnerStrategy;

import java.util.List;

public class GameController {
    public Game startGame(Integer size, List<Player> players, List<WinnerStrategyType> winnerStrategyTypes){
        // From playerIds I will get playerObjects from DB using ORM
        Game game = Game.getBuilder()
                .setSize(3)
                .setWinnerStrategyTypes(winnerStrategyTypes)
                .setPlayers(players)
                .build();
        // Map the object data in the DB against an id
        // Return the game-id
        return game;
    }

    public void display(Game game){
        // Fetch Game object from DB using game Id
        game.display();
    }

    public GameState getState(Game game){
        return game.getState();
    }

    public void makeNextMove(Game game){
        game.makeMove();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
    public void undo(Game game){
        game.undo();
    }
}
