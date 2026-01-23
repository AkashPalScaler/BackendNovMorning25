package TicTacToe.Models;

import TicTacToe.Validations.MoveValidation;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private Integer age;
    Scanner sc = new Scanner(System.in);

    public HumanPlayer(String name, PlayerType playerType, Symbol symbol, Integer age) {
        super(name, playerType, symbol);
        this.age = age;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println(this.getName()+ "'s move, please enter the row and column : ");

        Move move;
        do{
            int row = sc.nextInt();
            int col = sc.nextInt();
            move = new Move(this, new Cell(row, col));
        }while(!MoveValidation.validMove(move, board));
        return move;
    }
}
