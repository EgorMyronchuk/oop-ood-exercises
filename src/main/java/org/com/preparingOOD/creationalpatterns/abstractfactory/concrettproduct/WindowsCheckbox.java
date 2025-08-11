package org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Windows Checkbox");
    }
}
