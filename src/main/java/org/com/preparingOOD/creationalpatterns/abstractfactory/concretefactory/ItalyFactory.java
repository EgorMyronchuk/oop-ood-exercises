package org.com.preparingOOD.creationalpatterns.abstractfactory.concretefactory;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractfactory.GUIFactory;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct.ItalyButton;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct.ItalyCheckbox;

public class ItalyFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new ItalyButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new ItalyCheckbox();
    }
}
