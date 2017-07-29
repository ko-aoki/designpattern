package com.example.state;

/**
 * Created by ko-aoki on 2017/07/29.
 */
public class DayState implements State {

    private static DayState singleton = new DayState();
    private DayState(){};

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("金庫使用(昼間)");
    }

    @Override
    public void doAlerm(Context context) {
        context.callSecurityCenter("非常ベル(昼間)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("通常の通話(昼間)");
    }

    @Override
    public String toString() {
        return "[昼間]";
    }
}