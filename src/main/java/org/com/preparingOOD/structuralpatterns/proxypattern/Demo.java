package org.com.preparingOOD.structuralpatterns.proxypattern;

public class Demo {

    public static void main(String[] args) {
        ClientApp app = new ClientApp();

        app.run("employee");

        System.out.println("__________________________________");

        app.run("manager");
    }
}
