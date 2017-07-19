package com.example.bridge;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/07/04.
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        IntStream.range(0, times).forEach(i -> print());
    }
}
