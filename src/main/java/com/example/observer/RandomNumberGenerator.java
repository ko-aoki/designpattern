package com.example.observer;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/07/25.
 */
public class RandomNumberGenerator extends NumberGenerator{

    private Random random = new Random();

    private int number;

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {

        for(int i=0; i < 20; i++) {
            this.number = this.random.nextInt(50);
            this.notifyObservers();
        }
    }
}
