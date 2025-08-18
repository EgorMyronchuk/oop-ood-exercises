package org.com.preparingOOD.structuralpatterns.bridgepattern.renderer;

public class ThreeDRenderer implements Renderer{
    @Override
    public void renderCircle(float radius) {
        System.out.println("3D Render circle with radius: " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("3D Render square with side: " + side);
    }
}
