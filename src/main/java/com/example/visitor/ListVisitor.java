package com.example.visitor;

/**
 * Created by ko-aoki on 2017/07/18.
 */
public class ListVisitor implements Visitor {

    private String curDir = "";

    @Override
    public void visit(File file) {
        System.out.println(this.curDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(this.curDir + "/" + directory);
        String saveDir = this.curDir;
        this.curDir = this.curDir + "/" + directory.getName();
        directory.getEntryList().stream().forEach(e -> e.accept(this));
        this.curDir = saveDir;

    }
}
