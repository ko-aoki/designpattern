package com.example.prototype;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/06/27.
 */
public class MessageBox implements Product {

    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {

        int length = s.getBytes().length;
        IntStream.rangeClosed(1, length + 4).forEach(i -> System.out.print(decoChar));
        System.out.println("");
        System.out.println(decoChar + " " + s + " " + decoChar);
        IntStream.rangeClosed(1, length + 4).forEach(i -> System.out.print(decoChar));
        System.out.println("");
    }

    @Override
    public Product createClone() {

        Product product = null;
        try {
            // shallow copy
            product = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
