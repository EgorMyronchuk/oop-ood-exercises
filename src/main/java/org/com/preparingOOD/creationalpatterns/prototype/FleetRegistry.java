package org.com.preparingOOD.creationalpatterns.prototype;

import org.com.preparingOOD.creationalpatterns.prototype.shape.SpaceShip;

import java.util.HashMap;
import java.util.Map;

public class FleetRegistry {
    private Map<String, SpaceShip> shipList = new HashMap<>();

    public FleetRegistry() {
    }

    public SpaceShip getSpaceShip(String name) {
        return shipList.get(name);
    }

    public void putSpaceShip(String name ,SpaceShip ship) {
        shipList.put(name,ship);
    }
}
