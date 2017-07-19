package com.example.prototype;

import java.util.HashMap;

/**
 * Created by ko-aoki on 2017/06/27.
 */
public class Manager {

    private HashMap<String, Product> showCase = new HashMap<>();

    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = showCase.get(protoname);
        return  p.createClone();
    }
}
