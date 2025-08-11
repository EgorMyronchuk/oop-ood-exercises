package org.com.preparingOOD.creationalpatterns.abstractfactory;

import org.com.preparingOOD.creationalpatterns.abstractfactory.abstractfactory.GUIFactory;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concretefactory.ItalyFactory;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concretefactory.MacFactory;
import org.com.preparingOOD.creationalpatterns.abstractfactory.concretefactory.WindowsFactory;

import java.util.Scanner;


/**
 *
 **/
public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть тему: Windows, MacOS, Italy");
        String choice = scanner.nextLine();

        GUIFactory factory;

        switch (choice.toLowerCase()) {
            case "windows" -> factory = new WindowsFactory();
            case "macos" -> factory = new MacFactory();
            case "italy" -> factory = new ItalyFactory();
            default -> factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.renderUI();

    }

}
