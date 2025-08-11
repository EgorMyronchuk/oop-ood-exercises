package org.com.preparingOOD.creationalpatterns.prototype.concreteShape;

import org.com.preparingOOD.creationalpatterns.prototype.shape.SpaceShip;

public class CargoShip extends SpaceShip {
    public int cargoCapacity;
    public boolean hasRefrigeration;

    public CargoShip(CargoShip cargoShip) {
        super(cargoShip);
        if (cargoShip != null) {
            this.cargoCapacity = cargoShip.cargoCapacity;
            this.hasRefrigeration = cargoShip.hasRefrigeration;
        }
    }

    public CargoShip() {
    }


    @Override
    public CargoShip clone() {
        return new CargoShip(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof CargoShip) || !super.equals(object2)) return false;
        CargoShip shape2 = (CargoShip) object2;
        return shape2.cargoCapacity == this.cargoCapacity
                && shape2.hasRefrigeration == this.hasRefrigeration;
    }

}
