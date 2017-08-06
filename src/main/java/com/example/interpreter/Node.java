package com.example.interpreter;

/**
 * Created by ko-aoki on 2017/08/06.
 */
public interface Node {

    void parse(Context context) throws ParseException;
}
