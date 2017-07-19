package com.example.strategy;

import java.util.Random;

/**
 * Created by ko-aoki on 2017/07/07.
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand preHand;

    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            preHand =  Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        this.won = win;
    }
}
