package TicTacToe.Strategies.BotPlayerStrategy;

import TicTacToe.Models.BotPlayerDifficultyLevel;

public class BotPlayerStrategyFactory {
    public static BotPlayerStrategy getStrategy(BotPlayerDifficultyLevel level){
        if(level.equals(BotPlayerDifficultyLevel.EASY)){
            return new EasyBotPlayerStrategy();
        }
        // rest if else
        return null;
    }
}
