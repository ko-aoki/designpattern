package com.example.interpreter;

/**
 * Created by ko-aoki on 2017/08/06.
 */
// <primitive command> ::= go | right | left
public class PrimitiveCommandNode implements Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        this.name = context.currentToken();
        context.skipToken(this.name);

        if (!"go".equals(this.name) && !"right".equals(this.name) && !"left".equals(this.name)) {
            throw new ParseException(this.name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return "PrimitiveCommandNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
