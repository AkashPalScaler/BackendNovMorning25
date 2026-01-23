package TicTacToe.Strategies.BotPlayerStrategy;

import TicTacToe.Models.*;

import java.util.List;

public class EasyBotPlayerStrategy implements BotPlayerStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        // Next available position
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(player, new Cell(cell.getRow(), cell.getCol()));
                }
            }
        }
        return null;
    }
}
