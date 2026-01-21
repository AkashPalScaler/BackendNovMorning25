package TicTacToe.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Integer size;
    private List<List<Cell>> grid;

    public Board(Integer size) {
        this.size = size;
        grid = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            grid.add(new ArrayList<Cell>());
        }
        // Initialise cells here?
    }
}
