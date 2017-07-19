package com.example.bridge;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/07/03.
 */
public class StringDisplayImpl implements DisplayImpl {

    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = this.string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        this.printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void rawClose() {
        this.printLine();
    }

    private void printLine() {
        System.out.print("+");
        IntStream.range(0, this.width).forEach(i -> System.out.print("-"));
        System.out.println("+");
    }
}
