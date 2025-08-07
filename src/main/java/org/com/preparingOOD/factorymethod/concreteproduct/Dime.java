package org.com.preparingOOD.factorymethod.concreteproduct;

import org.com.preparingOOD.factorymethod.product.Coin;

public class Dime implements Coin {
    @Override
    public double coinDenomination() {
        return 0.1;
    }
}
