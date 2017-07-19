package com.example.bridge;

/**
 * Created by ko-aoki on 2017/07/04.
 */
public class BridgeMain {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan"));
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Hello, Hoge"));

        d1.display();
        d2.multiDisplay(3);
    }
}