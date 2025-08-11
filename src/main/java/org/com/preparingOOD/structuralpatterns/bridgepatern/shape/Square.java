package org.com.preparingOOD.structuralpatterns.bridgepatern.shape;

import org.com.preparingOOD.structuralpatterns.bridgepatern.renderer.Renderer;

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
