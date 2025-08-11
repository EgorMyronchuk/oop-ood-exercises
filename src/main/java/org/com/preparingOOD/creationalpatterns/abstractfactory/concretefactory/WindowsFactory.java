package org.com.preparingOOD.creationalpatterns.abstractfactory.concretefactory;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractfactory.GUIFactory;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct.WindowsButton;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concrettproduct.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
