package org.com.preparingOOD.creationalpatterns.factorymethod.concretecreater;

import org.com.preparingOOD.creationalpatterns.factorymethod.concreteproduct.Dime;
import org.com.preparingOOD.creationalpatterns.factorymethod.concreteproduct.Nickel;
import org.com.preparingOOD.creationalpatterns.factorymethod.concreteproduct.Penny;
import org.com.preparingOOD.creationalpatterns.factorymethod.concreteproduct.Quarter;
import org.com.preparingOOD.creationalpatterns.factorymethod.product.Coin;
import org.com.preparingOOD.creationalpatterns.factorymethod.product.CoinType;

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
