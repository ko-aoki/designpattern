package com.example.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by ko-aoki on 2017/07/28.
 */
public class Gamer {

    private int money;
    List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static final String[] fruitsname = {
            "りんご",
            "ぶどう",
            "バナナ",
            "みかん"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public void bet() {

        int dice = new Random().nextInt(6) + 1;

        switch (dice) {
            case 1:
                this.money += 100;
                System.out.println("所持金が増えました");
                break;
            case 2:
                this.money /= 2;
                System.out.println("所持金が半分になりました");
                break;
            case 6:
                String fruit = this.getFruit();
                System.out.println(fruit + "をもらいました");
                this.fruits.add(fruit);
                break;
            default:
                System.out.println("なにもおこりませんでした");
                break;
        }

    }

    public Memento createMemento() {
        Memento memento = new Memento(this.money);
        this.fruits.stream().filter(f -> f.startsWith("おいしい")).forEach(f -> memento.addFruit(f));

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String getFruit() {
        String prefix = "";
        if (this.random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + fruitsname[this.random.nextInt(fruitsname.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits.stream().collect(Collectors.joining(",")) +
                '}';
    }
}
