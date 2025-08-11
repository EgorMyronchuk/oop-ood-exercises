package org.com.preparingOOD.creationalpatterns.abstractfactory.concretefactory;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractfactory.GUIFactory;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct.MacButton;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
