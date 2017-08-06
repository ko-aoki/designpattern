package com.example.command;

import javafx.geometry.Point2D;

/**
 * Created by ko-aoki on 2017/08/05.
 */
public class DrawCommand implements Command {

    protected Drawable drawable;

    private Point2D position;

    public DrawCommand(Drawable drawable, Point2D position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        this.drawable.draw(this.position.getX(), this.position.getY());
    }
}
