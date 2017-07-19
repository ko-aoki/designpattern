package com.example.builder;

import java.util.List;

/**
 * Created by ko-aoki on 2017/07/01.
 */
public class TextBuilder implements Builder {

    private StringBuilder text = new StringBuilder();

    @Override
    public void makeTitle(String title) {

        text.append("=====================================¥n");
        text.append("[" + title + "]");
        text.append("¥n");
    }

    @Override
    public void makeString(String str) {

        text.append("■" + str + "¥n");
        text.append("¥n");
    }

    @Override
    public void makeItems(List<String> items) {

        items.stream().forEach(item -> text.append("・" + item + "¥n"));
        text.append("¥n");
    }

    @Override
    public void close() {

        text.append("=====================================¥n");
    }

    public  String getResult() {

        return this.text.toString();
    }
}
