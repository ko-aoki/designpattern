package com.example.visitor;

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

    public List<Entry> getEntryList() {
        return entryList;
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
    public void add(Entry entry) {
        this.entryList.add(entry);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
