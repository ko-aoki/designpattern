package com.example.command;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Created by ko-aoki on 2017/08/05.
 */
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.RED;

    private int radius = 6;

    private MacroCommand history;

    public DrawCanvas(double width, double height, MacroCommand history) {
        super(width, height);
        this.setHeight(height);
        this.setWidth(width);

        this.history = history;
    }

    public void paint(GraphicsContext gc) {
        history.execute();
    }

    @Override
    public void draw(double x, double y) {

        GraphicsContext gc = this.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

}
