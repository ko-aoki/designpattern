package com.example.decorator;

/**
 * Created by ko-aoki on 2017/07/16.
 */
public class DecoratorMain {

    public static void main(String[] args) {

        StringDisplay b1 = new StringDisplay("Hello, world");
        SideBorder b2 = new SideBorder(b1, '#');
        FullBorder b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();

        SideBorder b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("こんにちは")
                                        ),
                                        '*'
                                )
                        )
                ),
                '/'
        );
        b4.show();
    }
}
