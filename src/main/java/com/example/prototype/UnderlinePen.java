package com.example.prototype;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/06/27.
 */
public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length  = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        IntStream.rangeClosed(1, length).forEach(i -> System.out.print(this.ulchar));
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
