package com.example.decorator;

/**
 * Created by ko-aoki on 2017/07/16.
 */
public class SideBorder extends Border {

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + this.display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return this.display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return this.borderChar + this.display.getRowText(row) + this.borderChar;
    }
}
