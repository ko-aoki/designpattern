package com.example.strategy;

/**
 * Created by ko-aoki on 2017/07/09.
 */
public class StrategyMain {

    public static void main(String[] args) {

        int seed1 = 2;
        int seed2 = 1;

        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        for (int i=0; i < 10000; i++) {

            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();

            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            }
            if (hand2.isStrongerThan(hand1)) {
                System.out.println("Winner:" + player2);
                player2.win();
                player1.lose();
            }
            if(hand1 == hand2) {
                System.out.println("even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("-------------------------------");
        System.out.println(" total result");
        System.out.println(player1);
        System.out.println(player2);
    }
}
