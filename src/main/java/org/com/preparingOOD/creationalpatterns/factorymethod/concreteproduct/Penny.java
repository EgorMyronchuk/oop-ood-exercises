package org.com.preparingOOD.creationalpatterns.factorymethod.concreteproduct;

import org.com.preparingOOD.creationalpatterns.factorymethod.product.Coin;

public class Penny implements Coin {
    @Override
    public double coinDenomination() {
        return 0.01;
    }
}
