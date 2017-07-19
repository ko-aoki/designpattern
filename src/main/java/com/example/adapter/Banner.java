package com.example.adapter;

/**
 * Created by ko-aoki on 2017/06/25.
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public  void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public  void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
