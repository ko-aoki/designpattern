package com.example.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ko-aoki on 2017/08/01.
 */
public class BigCharFactory {

    private ConcurrentHashMap<String, BigChar> pool = new ConcurrentHashMap<>();

    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory(){}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = this.pool.get("" + charName);

        if (bc == null) {
            bc = new BigChar(charName);
            this.pool.put("" + charName, bc);
       }
       return bc;
    }
}
