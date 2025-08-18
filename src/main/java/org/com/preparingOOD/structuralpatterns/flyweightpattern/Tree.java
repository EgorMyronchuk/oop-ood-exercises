package org.com.preparingOOD.structuralpatterns.flyweightpattern;

public class Tree {
    int x;
    int y;
    String season;
    TreeType type;

    public Tree(int x, int y, String season, TreeType type) {
        this.x = x;
        this.y = y;
        this.season = season;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y, season);
    }
}
