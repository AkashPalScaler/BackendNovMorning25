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
           List<Cell> row = new ArrayList<Cell>();
           for(int j=0;j<size;j++){
               row.add(new Cell(i, j));
           }
           grid.add(row);
        }

    }

    public void display(){
        for(List<Cell> row : grid){
            for(Cell cell : row){
                cell.display();
            }
            System.out.println();
        }
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }
}
