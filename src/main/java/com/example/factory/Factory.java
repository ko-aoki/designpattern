package com.example.factory;

/**
 * Created by ko-aoki on 2017/06/26.
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product product = this.createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);
    protected abstract  void registerProduct(Product product);
}
