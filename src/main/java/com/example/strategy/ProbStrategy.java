package com.example.strategy;

import java.util.Random;

/**
 * Created by ko-aoki on 2017/07/08.
 */
public class ProbStrategy implements Strategy {

    private Random random;
    private int preHandValue = 0;
    private int curHandValue = 0;

    private int [][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
    };

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {

        int bet = random.nextInt(this.getSum(this.curHandValue));
        int handValue = 0;
        if (bet < this.history[this.curHandValue][0]) {
            handValue = 0;
        } else if ( bet < this.history[this.curHandValue][0] + this.history[curHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        this.preHandValue = this.curHandValue;
        this.curHandValue = handValue;

        return Hand.getHand(handValue);
    }

    @Override
    public void study(boolean win) {

        if (win) {
            this.history[this.preHandValue][this.curHandValue]++;
        } else {
            this.history[this.preHandValue][(this.curHandValue + 1) % 3]++;
            this.history[this.preHandValue][(this.curHandValue + 2) % 3]++;
        }

    }

    private int getSum(int hv) {

        int sum = 0;
        for (int i=0; i < 3; i++) {
            sum += this.history[hv][i];
        }
        return sum;
    }


}
