package com.example.interpreter;

/**
 * Created by ko-aoki on 2017/08/06.
 */
// <program> ::= program <command list>
public class ProgramNode implements Node{

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        this.commandListNode = new CommandListNode();
        this.commandListNode.parse(context);

    }

    @Override
    public String toString() {
        return "ProgramNode{" +
                "commandListNode=" + commandListNode +
                '}';
    }
}
