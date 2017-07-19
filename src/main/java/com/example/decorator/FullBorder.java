package com.example.decorator;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/07/16.
 */
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + this.display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + this.display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {

        if (row == 0) {
            return "+" + this.makeLine('-', this.display.getColumns()) + "+";
        }

        if (row == this.display.getRows() + 1) {
            return "+" + this.makeLine('-', this.display.getColumns()) + "+";
        }

        return "|" + this.display.getRowText(row - 1) + "|";
    }

    private String makeLine(char ch, int count) {
        return IntStream.range(0, count).mapToObj(i -> String.valueOf(ch)).collect(Collectors.joining());
    }
}
