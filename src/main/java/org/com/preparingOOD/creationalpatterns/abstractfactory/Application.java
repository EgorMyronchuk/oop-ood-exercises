package org.com.preparingOOD.creationalpatterns.abstractfactory;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractfactory.GUIFactory;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Button;
import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractproduct.Checkbox;

public class Application {
    Button button ;
    Checkbox checkbox ;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI (){
        button.render();
        checkbox.render();
    }
}
