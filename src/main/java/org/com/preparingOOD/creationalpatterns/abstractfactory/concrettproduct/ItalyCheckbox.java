package org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;

public class ItalyCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Italy Checkbox");
    }
}
