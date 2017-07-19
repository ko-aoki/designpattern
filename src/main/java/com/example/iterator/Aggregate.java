package com.example.iterator;

/**
 * Created by ko-aoki on 2017/06/24.
 */
public interface Aggregate<T> {

    Iterator<T> iterator();
}
