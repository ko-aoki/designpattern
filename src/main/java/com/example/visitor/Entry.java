package com.example.visitor;

/**
 * Created by ko-aoki on 2017/07/15.
 */
public abstract class Entry implements Element{

    abstract String getName();
    abstract int getSize();
    abstract void add(Entry entry);

    public String toString() {
        return this.getName() + "(" + this.getSize() + ")";
    };

}
