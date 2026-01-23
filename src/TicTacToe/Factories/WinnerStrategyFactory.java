package TicTacToe.Factories;

import TicTacToe.Models.WinnerStrategyType;
import TicTacToe.Strategies.WinnerStrategies.*;

public class WinnerStrategyFactory {
    public static WinnerStrategy getStrategy(WinnerStrategyType type){
        if(type == WinnerStrategyType.COLUMN){
            return new ColumnWinningStrategy();
        }else if(type == WinnerStrategyType.ROW){
            return new RowWinningStrategy();
        }else if(type == WinnerStrategyType.DIAGONAL){
            return new DiagonalWinningStrategy();
        }else if(type == WinnerStrategyType.CORNER){
            return new CornerWinningStrategy();
        }else{
            throw new RuntimeException("Invalid type");
        }
    }
}
