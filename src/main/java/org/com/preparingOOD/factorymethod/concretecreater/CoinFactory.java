package org.com.preparingOOD.factorymethod.concretecreater;

import org.com.preparingOOD.factorymethod.concreteproduct.Dime;
import org.com.preparingOOD.factorymethod.concreteproduct.Nickel;
import org.com.preparingOOD.factorymethod.concreteproduct.Penny;
import org.com.preparingOOD.factorymethod.concreteproduct.Quarter;
import org.com.preparingOOD.factorymethod.product.Coin;
import org.com.preparingOOD.factorymethod.product.CoinType;

public class CoinFactory {

    public Coin getCoin(CoinType coin) {
        return switch (coin) {
            case PENNY -> new Penny();
            case DIME -> new Dime();
            case NICKEL -> new Nickel();
            case QUARTER -> new Quarter();
        };
    }
}
