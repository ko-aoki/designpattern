package com.example.chainofresponsitory;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {

        if(trouble.getNumber() %2 == 1) {
            return true;
        }
        return false;
    }
}
