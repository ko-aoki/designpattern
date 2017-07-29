package com.example.chainofresponsitory;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public class NotSupport extends Support {

    public NotSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
