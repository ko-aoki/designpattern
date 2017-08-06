package com.example.flyweight;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/08/02.
 */
public class BigString {

    private BigChar[] bigChars;

    public BigString(String str) {
        this.bigChars = new BigChar[str.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        IntStream.range(0, this.bigChars.length)
                .forEach(
                        i -> this.bigChars[i] = factory.getBigChar(str.charAt(i)));
    }

    public void print() {
        IntStream.range(0, this.bigChars.length).forEach(i -> this.bigChars[i].print());
    }
}
