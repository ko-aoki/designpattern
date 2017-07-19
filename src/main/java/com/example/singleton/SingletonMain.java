package com.example.singleton;

/**
 * Created by ko-aoki on 2017/06/27.
 */
public class SingletonMain {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同一インスタンスです。");
        }
    }
}
