package com.example.singleton;

/**
 * Created by ko-aoki on 2017/06/27.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("インスタンスを生成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
