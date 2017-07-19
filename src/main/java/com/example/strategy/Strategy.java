package com.example.strategy;

/**
 * Created by ko-aoki on 2017/07/06.
 */
public interface Strategy {

    Hand nextHand();
    void study(boolean win);
}
