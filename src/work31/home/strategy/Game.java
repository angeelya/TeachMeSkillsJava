package work31.home.strategy;

public class Game {
    private Strategy strategy;

    public Game(Strategy strategy) {
        this.strategy = strategy;
    }

    public void getStrategy() {
        strategy.getStrategy();
    }
}
