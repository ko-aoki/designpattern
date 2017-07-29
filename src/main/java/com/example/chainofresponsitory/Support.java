package com.example.chainofresponsitory;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {

        if (this.resolve(trouble)) {
            this.done(trouble);
        } else if (this.next != null) {
            this.next.support(trouble);
        } else {
            this.fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name  +
                '}';
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + "is rosolved by" + this);
    };
    protected void fail(Trouble trouble) {
        System.out.println(trouble + "cannot be resolved");
    };

}
