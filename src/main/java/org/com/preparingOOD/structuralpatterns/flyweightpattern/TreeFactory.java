package org.com.preparingOOD.structuralpatterns.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private Map<String, ConcreteTreeType> treeTypes = new HashMap<>();

    public TreeType getTreeType(String texture, String model){
        if (texture == null || model == null ) throw new RuntimeException();
        if(treeTypes.containsKey(texture+"_"+model)) {
            return treeTypes.get(texture+"_"+model);
        }
        treeTypes.put(texture+"_"+model, new ConcreteTreeType(texture, model));
        return treeTypes.get(texture+"_"+model);
    }

    public int getTreeTypesCount() {
        return treeTypes.size();
    }

    public void printTreeTypesHashCodes() {
        treeTypes.values().forEach(t -> System.out.println(t.hashCode()));
    }
}
