package com.example.prototype;

/**
 * Created by ko-aoki on 2017/06/27.
 */
public interface Product extends Cloneable {

    void use(String s);
    Product createClone();
}
