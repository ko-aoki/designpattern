package com.example.interpreter;

import com.example.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ko-aoki on 2017/08/06.
 */
// <command list> ::= <command> end
public class CommandListNode implements Node {

    private List<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return "CommandListNode{" +
                "list=" + list +
                '}';
    }
}
