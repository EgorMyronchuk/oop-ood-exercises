package org.com.preparingOOD.structuralpatterns.bridgepattern.shape;

import org.com.preparingOOD.structuralpatterns.bridgepattern.renderer.Renderer;

public class Square extends Shape {
    float length;

    public Square(Renderer render , float length) {
        super(render);
        this.length = length;
    }

    @Override
    public void draw() {
        render.renderSquare(length);
    }
}
