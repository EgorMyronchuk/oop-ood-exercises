package org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac Checkbox");
    }
}
