package org.com.preparingOOD.creationalpatterns.factorymethod.concreteproduct;

import org.com.preparingOOD.creationalpatterns.factorymethod.product.Coin;

public class Dime implements Coin {
    @Override
    public double coinDenomination() {
        return 0.1;
    }
}
