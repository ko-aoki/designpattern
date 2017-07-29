package com.example.observer;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/07/25.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver");

        int count = generator.getNumber();
        IntStream.range(0, count).forEach(i ->
                System.out.print("*")
        );
        System.out.println();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
