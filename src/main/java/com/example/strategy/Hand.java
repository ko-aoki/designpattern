package com.example.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ko-aoki on 2017/07/06.
 */
public enum Hand {

    GU(0),CHOKI(1),PA(2);

    int val;

    Hand(int val) {
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }

    public static Hand getHand(int val) {

        List<Hand> hands = Arrays.stream(Hand.values()).filter(h -> h.getVal() == val).collect(Collectors.toList());

        if (hands.isEmpty()) {
            throw new IllegalArgumentException("error arg : Hand val is " + val);
        }

        return hands.get(0);
    }

    public boolean isStrongerThan(Hand hand) {

        return this.fight(hand) > 0;
    }

    public boolean isWeakerThan(Hand hand) {

        return this.fight(hand) < 0;
    }

    public int fight(Hand hand) {

        // あいこ
        if (this == hand) {
            return 0;
        }

        // 勝ち
        switch (this) {
            case GU:
                if (hand == CHOKI) {
                    return 1;
                }
            case CHOKI:
                if (hand == PA) {
                    return 1;
                }
            case PA:
                if (hand == GU) {
                    return 1;
                }
        }
        return -1;
    }
}
