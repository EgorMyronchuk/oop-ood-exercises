package org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
    }
}
