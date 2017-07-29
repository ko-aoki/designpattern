package com.example.state;

/**
 * Created by ko-aoki on 2017/07/29.
 */
public interface Context {

    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
