package org.com.preparingOOD.creationalpatterns.prototype.shape;

import java.util.Objects;

public abstract class SpaceShip {
    public String name;
    public int speed;
    public int fuelCapacity;
    public String color;

    public abstract SpaceShip clone();

    public SpaceShip() {}

    public SpaceShip(SpaceShip spaceShip) {
        if(spaceShip != null){
            this.name = spaceShip.name;
            this.speed = spaceShip.speed;
            this.fuelCapacity = spaceShip.fuelCapacity;
            this.color = spaceShip.color;
        }
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof SpaceShip)) return false;
        SpaceShip shape2 = (SpaceShip) object2;
        return Objects.equals(shape2.name, this.name)
                && shape2.speed == this.speed
                && Objects.equals(shape2.color, color)
                && shape2.fuelCapacity == this.fuelCapacity;
    }

}
