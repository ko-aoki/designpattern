package com.example.composite;

/**
 * Created by ko-aoki on 2017/07/15.
 */
public abstract class Entry {

    abstract String getName();
    abstract int getSize();
    abstract void printList(String prefix);
    abstract void add(Entry entry);

    public String toString() {
        return this.getName();
    };

}
