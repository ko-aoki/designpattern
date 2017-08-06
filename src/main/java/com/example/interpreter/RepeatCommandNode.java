package com.example.interpreter;

/**
 * Created by ko-aoki on 2017/08/06.
 */
// <repeat command> ::= repeat <number> <command list>
public class RepeatCommandNode implements Node {

    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {

        context.skipToken("repeat");
        this.number = context.currentNumber();
        context.nextToken();
        this.commandListNode = new CommandListNode();
        this.commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "RepeatCommandNode{" +
                "number=" + number +
                ", commandListNode=" + commandListNode +
                '}';
    }
}
