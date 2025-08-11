package org.com.preparingOOD.creationalpatterns.abstractfactory.abstractfactory;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;

public interface GUIFactory {

    public Button createButton();

    public Checkbox createCheckbox();
}
