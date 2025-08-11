package org.com.preparingOOD.structuralpatterns.bridgepatern.renderer;

public class TwoDRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("2D Render circle with radius: " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("2D Render square with side: " + side);
    }
}
