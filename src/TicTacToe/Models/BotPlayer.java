package TicTacToe.Models;

import TicTacToe.Strategies.BotPlayerStrategy.BotPlayerStrategy;
import TicTacToe.Strategies.BotPlayerStrategy.BotPlayerStrategyFactory;
import TicTacToe.Validations.MoveValidation;

import java.util.List;

public class BotPlayer extends Player {
    private BotPlayerDifficultyLevel botPlayerDifficultyLevel;
    private BotPlayerStrategy botPlayerStrategy;

    public BotPlayer(String name, PlayerType playerType, Symbol symbol, BotPlayerDifficultyLevel botPlayerDifficultyLevel) {
        super(name, playerType, symbol);
        this.botPlayerDifficultyLevel = botPlayerDifficultyLevel;
        botPlayerStrategy = BotPlayerStrategyFactory.getStrategy(botPlayerDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println(this.getName()+ " is planning it's move");
        return botPlayerStrategy.makeMove(board, this);
    }
}
