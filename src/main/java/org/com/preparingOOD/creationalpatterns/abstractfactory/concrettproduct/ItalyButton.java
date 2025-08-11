package org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;

public class ItalyButton implements Button {
    @Override
    public void render() {
        System.out.println("Italy button");
    }
}
