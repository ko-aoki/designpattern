package com.example.strategy;

/**
 * Created by ko-aoki on 2017/07/09.
 */
public class Player {

    private String name;
    private Strategy strategy;

    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    public String toString() {

        return "name:" + name + " gameCount:" + gameCount + " winCount:" + winCount + " loseCount:" + loseCount;
    }
}
