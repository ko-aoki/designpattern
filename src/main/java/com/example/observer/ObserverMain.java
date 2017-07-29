package com.example.observer;

/**
 * Created by ko-aoki on 2017/07/25.
 */
public class ObserverMain {

    public static void main(String[] args) {

        RandomNumberGenerator generator = new RandomNumberGenerator();
        DigitObserver digitObserver = new DigitObserver();
        GraphObserver graphObserver = new GraphObserver();
        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);

        generator.execute();
    }
}
