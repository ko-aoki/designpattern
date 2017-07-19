package com.example.factory;

/**
 * Created by ko-aoki on 2017/06/26.
 */
public class IdCard implements Product {

    private String owner;

    IdCard(String owner) {
        System.out.println(owner + "のカードを作ります");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "のカードを使います");
    }

    public  String getOwner() {
        return this.owner;
    }
}
