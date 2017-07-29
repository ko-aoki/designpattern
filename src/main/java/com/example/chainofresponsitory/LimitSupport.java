package com.example.chainofresponsitory;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public class LimitSupport extends Support {

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < this.limit) {
            return true;
        }
        return false;
    }
}
