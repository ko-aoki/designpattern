package com.example.composite;

/**
 * Created by ko-aoki on 2017/07/15.
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    public void add(Entry entry) {
        throw new RuntimeException("不正なファイル操作");
    }

}
