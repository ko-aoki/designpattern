package com.example.decorator;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/07/16.
 */
public interface Display {

    int getColumns();
    int getRows();
    String getRowText(int row);

    default void show() {
        IntStream.range(0, this.getRows()).forEach(
                i -> System.out.println(this.getRowText(i))
        );
    }
}
