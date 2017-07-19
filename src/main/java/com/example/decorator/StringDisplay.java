package com.example.decorator;

import java.io.UnsupportedEncodingException;

/**
 * Created by ko-aoki on 2017/07/16.
 */
public class StringDisplay implements Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        try {
            return this.string.getBytes("UTF8").length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return this.string;
        } else {
            return null;
        }
    }
}
