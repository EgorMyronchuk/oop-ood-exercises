package org.com.preparingOOD.structuralpatterns.bridgepattern.shape;

import org.com.preparingOOD.structuralpatterns.bridgepattern.renderer.Renderer;

public abstract class Shape {
    protected Renderer render;

    public Shape(Renderer render) {
        this.render = render;
    }

    public abstract void draw();
}
