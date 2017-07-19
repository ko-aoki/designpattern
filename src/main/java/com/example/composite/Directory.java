package com.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ko-aoki on 2017/07/15.
 */
public class Directory extends Entry {

    private String name;

    private List<Entry> entryList = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {

        return this.entryList.stream().collect(Collectors.summingInt(e -> e.getSize()));
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        this.entryList.stream().forEach(e -> e.printList(prefix + "/" + this.getName()));
    }

    @Override
    public void add(Entry entry) {
        this.entryList.add(entry);
    }

}
