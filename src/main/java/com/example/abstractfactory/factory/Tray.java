package com.example.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public abstract class Tray extends Item {

    protected List<Item> trayList = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        trayList.add(item);
    }
}
