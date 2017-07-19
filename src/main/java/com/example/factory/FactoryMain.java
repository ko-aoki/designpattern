package com.example.factory;

/**
 * Created by ko-aoki on 2017/06/26.
 */
public class FactoryMain {

    public static void main(String[] args) {
        IdCardFactory idCardFactory = new IdCardFactory();
        Product p1 = idCardFactory.create("オーナー1");
        Product p2 = idCardFactory.create("オーナー2");
        Product p3 = idCardFactory.create("オーナー3");
        p1.use();
        p2.use();
        p3.use();
    }
}
