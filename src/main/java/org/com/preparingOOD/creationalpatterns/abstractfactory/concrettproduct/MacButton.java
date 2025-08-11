package org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac Button");
    }
}
