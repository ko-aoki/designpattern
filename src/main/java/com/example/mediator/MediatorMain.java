package com.example.mediator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by ko-aoki on 2017/08/06.
 */
public class MediatorMain extends Application {

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;

    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("State Pattern");

        Button clearBtn = new Button();
        clearBtn.setText("clear");
        clearBtn.setOnAction(e -> {
                }
        );

        BorderPane pane = new BorderPane();

//        pane.setCenter(canvas);

        FlowPane flow = new FlowPane();
        flow.getChildren().add(clearBtn);
        pane.setBottom(flow);

        primaryStage.setScene(new Scene(pane));
        primaryStage.show();

    }
}
