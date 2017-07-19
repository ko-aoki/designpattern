package com.example.template;

import java.io.UnsupportedEncodingException;
import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/06/25.
 */
public class StringDisplay extends AbstractDisplay {

    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        try {
            this.width = string.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void open() {
        this.printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void close() {
        this.printLine();
    }

    private void printLine() {
        System.out.print("+");
        IntStream.range(1, this.width).forEach(
                i->{
                    System.out.print("-");
                }
        );
        System.out.println("+");
    }
}
