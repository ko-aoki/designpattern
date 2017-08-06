package com.example.interpreter;

/**
 * Created by ko-aoki on 2017/08/06.
 */
// <command> ::= <repeat command> | <primitive command>
public class CommandNode implements Node {

    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            this.node = new RepeatCommandNode();
            this.node.parse(context);
        } else {
            this.node = new PrimitiveCommandNode();
            this.node.parse(context);
        }
    }

    @Override
    public String toString() {
        return "CommandNode{" +
                "node=" + node +
                '}';
    }
}
