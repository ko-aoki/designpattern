package com.example.mediator;

import javafx.scene.control.Button;

/**
 * Created by ko-aoki on 2017/08/06.
 */
public class ColleagueButton extends Button implements Colleague{

    private Mediator mediatror;

    public ColleagueButton(Mediator mediatror) {
        this.mediatror = mediatror;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediatror = mediator;
    }

    @Override
    public void setColleagueDisabled(boolean disabled) {
        this.setDisabled(disabled);
    }
}
