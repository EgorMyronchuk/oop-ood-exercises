package org.com.preparingOOD.structuralpatterns.bridgepattern;

import org.com.preparingOOD.structuralpatterns.bridgepattern.renderer.ThreeDRenderer;
import org.com.preparingOOD.structuralpatterns.bridgepattern.renderer.TwoDRenderer;
import org.com.preparingOOD.structuralpatterns.bridgepattern.shape.Circle;
import org.com.preparingOOD.structuralpatterns.bridgepattern.shape.Square;

public class Application {
    public static void main(String[] args) {
        //2D
        Circle circle2d = new Circle(new TwoDRenderer() , 20f);
        Square square2d = new Square(new TwoDRenderer() , 15f);
        circle2d.draw();
        square2d.draw();
        //3d
        Circle circle3d = new Circle(new ThreeDRenderer() , 10f);
        Square square3d = new Square(new ThreeDRenderer() , 22f);
        circle3d.draw();
        square3d.draw();


    }
}
