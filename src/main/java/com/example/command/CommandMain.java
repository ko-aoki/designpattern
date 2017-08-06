package com.example.command;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by ko-aoki on 2017/07/29.
 */
public class CommandMain extends Application {

    private MacroCommand history = new MacroCommand();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("State Pattern");

        DrawCanvas canvas = new DrawCanvas(300, 250, history);
        canvas.setOnMouseDragged(e -> {
                    Command command = new DrawCommand(canvas, new Point2D(e.getX(), e.getY()));
                    history.append(command);
                    command.execute();
                }
        );

        GraphicsContext gc = canvas.getGraphicsContext2D();
        Button clearBtn = new Button();
        clearBtn.setText("clear");
        clearBtn.setOnAction(e -> {
                    this.history.clear();
                    gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                }
        );

        BorderPane pane = new BorderPane();

        pane.setCenter(canvas);

        FlowPane flow = new FlowPane();
        flow.getChildren().add(clearBtn);
        pane.setBottom(flow);

        primaryStage.setScene(new Scene(pane));
        primaryStage.show();

    }

}
