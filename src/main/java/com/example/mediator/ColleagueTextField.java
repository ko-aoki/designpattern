package com.example.mediator;

import javafx.scene.control.TextField;

/**
 * Created by ko-aoki on 2017/08/06.
 */
public class ColleagueTextField extends TextField implements Colleague{

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueDisabled(boolean disabled) {
        setDisable(disabled);
    }


}
