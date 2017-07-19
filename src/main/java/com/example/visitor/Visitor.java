package com.example.visitor;

/**
 * Created by ko-aoki on 2017/07/18.
 */
public interface Visitor {

    void visit(File file);
    void visit(Directory directory);
}
