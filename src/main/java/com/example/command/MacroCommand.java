package com.example.command;

import java.util.Stack;

/**
 * Created by ko-aoki on 2017/08/05.
 */
public class MacroCommand implements Command {

    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {

        commands.stream().forEach(c -> execute());
    }

    public void append(Command command) {
        if (command != this) {
            this.commands.push(command);
        }
    }

    public void undo() {
        if (!this.commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        this.commands.clear();
    }

}
