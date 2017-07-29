package com.example.state;

/**
 * Created by ko-aoki on 2017/07/29.
 */
public interface State {

    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlerm(Context context);
    void doPhone(Context context);
}
