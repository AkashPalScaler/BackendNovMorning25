package TicTacToe.Models;

import TicTacToe.Factories.WinnerStrategyFactory;
import TicTacToe.Strategies.WinnerStrategies.WinnerStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState state;
    private List<Move> moveHistory;
    private Player winner;
    private Integer nextPlayerIndex;
    private List<WinnerStrategy> winnerStrategies;

    private Game(Builder builder) {
        this.board = new Board(builder.getSize());
        this.players = builder.getPlayers();
        this.state = GameState.IN_PROGRESS;
        this.moveHistory = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.winnerStrategies = new ArrayList<>();
        for(WinnerStrategyType type : builder.getWinnerStrategyTypes()){
            winnerStrategies.add(WinnerStrategyFactory.getStrategy(type));
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }

    public List<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(List<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinnerStrategy> getWinnerStrategies() {
        return winnerStrategies;
    }

    public void setWinnerStrategies(List<WinnerStrategy> winnerStrategies) {
        this.winnerStrategies = winnerStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void display(){
        board.display();
    }

    public void makeMove(){
        // Getting the player who makes the next move
        Player currPlayer = players.get(nextPlayerIndex);
        // Get a move from player - Call player.makeMove() - Check validity of the move
        Move move = currPlayer.makeMove(this.board);
        // Update the next player index
        nextPlayerIndex++;
        nextPlayerIndex %= players.size();
        // Update the board
        Cell cell = move.getCell(); // Get the cell from move for the values

        // Update the cell of the board with values from move cell, never replace the cell on the board
        board.getGrid().get(cell.getRow()).get(cell.getCol()).setSymbol(currPlayer.getSymbol());
        board.getGrid().get(cell.getRow()).get(cell.getCol()).setCellState(CellState.OCCUPIED);

        // Update the moveHistory
        moveHistory.add(move);
        // Check winner
        if(this.checkWinner(move)){
            setWinner(currPlayer);
            setState(GameState.ENDED_WITH_WIN);
        }
        // Check draw condition
        else if(this.moveHistory.size() == board.getSize()* board.getSize()){
            setState(GameState.DRAW);
        }
    }

    public void undo(){
        // Get last move and remove from move history
        Move lastMove = moveHistory.getLast();
        // Update the board
        Cell cell = lastMove.getCell();
        board.getGrid().get(cell.getRow()).get(cell.getCol()).setSymbol(null);
        board.getGrid().get(cell.getRow()).get(cell.getCol()).setCellState(CellState.EMPTY);
        // Rollback the player
        // (a-b)%m -> (a % m - b%m + m)%m
        nextPlayerIndex = nextPlayerIndex - 1 + board.getSize();
        nextPlayerIndex %= players.size();
        // Reset the winner and reset the gameState
        setWinner(null);
        setState(GameState.IN_PROGRESS);
        // undo the check winner count map
        this.checkWinnerUndo(lastMove);

    }

    private boolean checkWinner(Move move){
        for(WinnerStrategy winnerStrategy : winnerStrategies){
            if(winnerStrategy.checkWinner(move, board)){
                return true;
            }
        }
        return false;
    }

    private void checkWinnerUndo(Move move){
        for(WinnerStrategy winnerStrategy : winnerStrategies){
            winnerStrategy.undoCountMap(move);
        }
    }

    public static class Builder{
        private Integer size;
        private List<Player> players;
        private List<WinnerStrategyType> winnerStrategyTypes;

        public Integer getSize() {
            return size;
        }

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public List<WinnerStrategyType> getWinnerStrategyTypes() {
            return winnerStrategyTypes;
        }

        public Builder setWinnerStrategyTypes(List<WinnerStrategyType> winnerStrategyTypes) {
            this.winnerStrategyTypes = winnerStrategyTypes;
            return this;
        }

        public Game build(){
            return new Game(this);
        }
    }
}
