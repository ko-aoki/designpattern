package com.example.observer;

/**
 * Created by ko-aoki on 2017/07/25.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {

        System.out.println("DigitObserver:" + generator.getNumber());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // なにもしない
        }
    }
}
