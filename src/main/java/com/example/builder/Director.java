package com.example.builder;

import java.util.Arrays;

/**
 * Created by ko-aoki on 2017/07/01.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {

        builder.makeTitle("Greeting");
        builder.makeString("朝から昼にかけて");
        builder.makeItems(Arrays.asList("おはようございます", "こんにちは"));
        builder.makeString("夜に");
        builder.makeItems(Arrays.asList("こんばんは","おやすみなさい","さようなら"));
        builder.close();
    }
}
