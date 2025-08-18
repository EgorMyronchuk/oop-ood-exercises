package org.com.preparingOOD.structuralpatterns.flyweightpattern;

class ConcreteTreeType implements TreeType {
    private final String texture;
    private final String model;

    public ConcreteTreeType(String texture, String model) {
        this.texture = texture;
        this.model = model;
    }

    @Override
    public void draw(int x, int y, String season) {
        System.out.printf("Build texture: %s , model: %s \n", texture , model);
        System.out.printf("Build om position: x = %s y = %s and season %s \n", x , y , season);
    }

}