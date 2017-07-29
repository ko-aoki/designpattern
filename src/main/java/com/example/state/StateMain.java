package com.example.state;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by ko-aoki on 2017/07/29.
 */
public class StateMain extends Application implements Context {

    private State state = DayState.getInstance();
    Label label = new Label("");
    TextArea textArea = new TextArea();
    Button useBtn = new Button();
    Button belBtn = new Button();
    Button phoneBtn = new Button();
    Button endBtn = new Button();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("State Pattern");
        useBtn.setText("金庫使用");
        useBtn.setOnAction(e->
                state.doUse(this)
        );
        belBtn.setText("非常ベル");
        belBtn.setOnAction(e->
                state.doAlerm(this)
        );
        phoneBtn.setText("通常通話");
        phoneBtn.setOnAction(e->
                state.doPhone(this)
        );
        endBtn.setText("終了");
        endBtn.setOnAction(e->
                System.exit(0)
        );

        BorderPane pane = new BorderPane();
        pane.setTop(label);

        pane.setCenter(textArea);

        FlowPane flow = new FlowPane();
        flow.getChildren().add(useBtn);
        flow.getChildren().add(belBtn);
        flow.getChildren().add(phoneBtn);
        flow.getChildren().add(endBtn);
        pane.setBottom(flow);
        primaryStage.setScene(new Scene(pane,300,250));
        primaryStage.show();

        Service<Boolean> service  = new Service<Boolean>() {
            @Override
            protected Task<Boolean> createTask() {
                // タスクを定義
                Task<Boolean> task = new Task<Boolean>() {
                    @Override
                    protected Boolean call() throws Exception {
                        for (int i=0; i<24; i++) {
                            StateMain.this.setClock(i);
                            Thread.sleep( 1000 );
                        }
                        return true;
                    }
                };
                // 作成したタスクを返す
                return task;
            }
        };

// サービスを開始
        service.start();
    }

    @Override
    public void setClock(int hour) {
        String clockStr = "現在時刻は";
        if (hour < 10) {
            clockStr += "0" + hour + ":00";
        } else {
            clockStr += hour + ":00";
        }
        final String clockFinalStr  = clockStr;
        Platform.runLater(() -> this.label.setText(clockFinalStr));
        Platform.runLater(() -> this.state.doClock(this, hour));
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        this.textArea.appendText(msg + System.lineSeparator());
    }

    @Override
    public void recordLog(String msg) {
        this.textArea.appendText("record.." + msg + System.lineSeparator());
    }
}
