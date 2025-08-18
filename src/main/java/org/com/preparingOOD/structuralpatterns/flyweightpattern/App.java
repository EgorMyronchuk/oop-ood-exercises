package org.com.preparingOOD.structuralpatterns.flyweightpattern;

public class App {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(10, 20, "summer", "oakTexture", "oakModel");
        forest.plantTree(15, 25, "winter", "oakTexture", "oakModel");
        forest.plantTree(30, 40, "spring", "pineTexture", "pineModel");
        forest.plantTree(50, 60, "autumn", "pineTexture", "pineModel");
        forest.plantTree(70, 80, "summer", "birchTexture", "birchModel");

        forest.draw();


        System.out.println("Number of unique tree types (TreeType): "
                + forest.getTreeTypesCount());
        System.out.println("Total number of trees in the forest: "
                + forest.getTreesCount());

        forest.printTreeTypesHashCodes();
    }
}
