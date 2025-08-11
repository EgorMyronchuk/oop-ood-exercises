package org.com.preparingOOD.structuralpatterns.bridgepatern.shape;

import org.com.preparingOOD.structuralpatterns.bridgepatern.renderer.Renderer;

public abstract class Shape {
    protected Renderer render;

    public Shape(Renderer render) {
        this.render = render;
    }

    public abstract void draw();
}
