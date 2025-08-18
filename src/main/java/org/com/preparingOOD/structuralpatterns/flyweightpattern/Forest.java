package org.com.preparingOOD.structuralpatterns.flyweightpattern;

import java.util.ArrayList;
import java.util.List;

public class Forest  {
    List<Tree> forest = new ArrayList<Tree>();
    private final TreeFactory treeFactory = new TreeFactory();

    public void plantTree(int x, int y, String season, String texture, String model) {
        TreeType type = treeFactory.getTreeType(texture, model);

        Tree tree = new Tree(x, y, season, type);

        forest.add(tree);
    }

    public void draw() {
        for (Tree tree : forest) {
            tree.draw();
        }
    }

    public int getTreesCount() {
        return forest.size();
    }

    public int getTreeTypesCount() {
        return treeFactory.getTreeTypesCount();
    }

    public void printTreeTypesHashCodes() {
        treeFactory.printTreeTypesHashCodes();
    }
}
