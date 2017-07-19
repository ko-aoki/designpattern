package com.example.iterator;

/**
 * Created by ko-aoki on 2017/06/24.
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
