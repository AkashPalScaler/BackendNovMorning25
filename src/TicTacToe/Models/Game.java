package TicTacToe.Models;

import TicTacToe.Factories.WinnerStrategyFactory;
import TicTacToe.Strategies.*;

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
