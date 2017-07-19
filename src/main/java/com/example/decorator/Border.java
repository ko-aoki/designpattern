package com.example.decorator;

/**
 * Created by ko-aoki on 2017/07/16.
 */
public abstract class Border implements Display{

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
