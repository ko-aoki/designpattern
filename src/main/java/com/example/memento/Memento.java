package com.example.memento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ko-aoki on 2017/07/28.
 */
public class Memento {

    int money;
    List<String> fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    public int getMoney() {
        return money;
    }

    public void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    public List getFruits() {
        // インスタンス複製
        return this.fruits.stream().collect(Collectors.toList());
    }
}
