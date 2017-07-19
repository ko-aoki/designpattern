package com.example.abstractfactory.factory;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
