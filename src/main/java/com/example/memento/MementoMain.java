package com.example.memento;

/**
 * Created by ko-aoki on 2017/07/28.
 */
public class MementoMain {

    public static void main(String[] args) {

        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for(int i=0; i<100; i++) {
            System.out.println("=======" + i);
            System.out.println("現状:" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("保存");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("復帰");
                gamer.restoreMemento(memento);
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        System.out.println();
    }
}
