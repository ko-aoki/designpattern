package com.example.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ko-aoki on 2017/06/26.
 */
public class IdCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IdCard)product).getOwner());
    }

    private List<String> getOwners() {
        return this.owners;
    }
}
