package org.com.preparingOOD.structuralpatterns.bridgepattern.shape;

import org.com.preparingOOD.structuralpatterns.bridgepattern.renderer.Renderer;

public class Circle extends Shape{
    public float radius;

    public Circle(Renderer render, float radius) {
        super(render);
        this.radius = radius;
    }

    @Override
    public void draw() {
        render.renderCircle(radius);
    }
}
