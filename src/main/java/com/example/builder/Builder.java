package com.example.builder;

import java.util.List;

/**
 * Created by ko-aoki on 2017/07/01.
 */
public interface Builder {

    void makeTitle(String title);
    void makeString(String str);
    void makeItems(List<String> items);
    void close();
    String getResult();
}
