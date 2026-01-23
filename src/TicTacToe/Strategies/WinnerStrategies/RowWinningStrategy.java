package TicTacToe.Strategies.WinnerStrategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinnerStrategy{
    HashMap<Integer, HashMap<Character, Integer>> countMap = new HashMap<>();
    @Override
    public Boolean checkWinner(Move move, Board board) {
        int row = move.getCell().getRow();

        countMap.putIfAbsent(row, new HashMap<>());
        HashMap<Character, Integer> temp = countMap.get(row);

        Character symChar = move.getPlayer().getSymbol().getCharacter();

        temp.putIfAbsent(symChar , 0);
        temp.put(symChar, temp.get(symChar) + 1);

        if(temp.get(symChar) == board.getSize()){
            return true;
        }

        return false;
    }
    public void undoCountMap(Move move){
        int row = move.getCell().getRow();
        HashMap<Character, Integer> temp = countMap.get(row);
        Character symChar = move.getPlayer().getSymbol().getCharacter();
        temp.put(symChar, temp.get(symChar)-1);
    }

}
