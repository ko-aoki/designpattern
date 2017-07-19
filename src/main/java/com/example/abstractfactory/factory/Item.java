package com.example.abstractfactory.factory;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}
