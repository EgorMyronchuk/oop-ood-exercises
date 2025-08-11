package org.com.preparingOOD.creationalpatterns.prototype;

import org.com.preparingOOD.creationalpatterns.prototype.concreteShape.BattleShip;
import org.com.preparingOOD.creationalpatterns.prototype.concreteShape.CargoShip;
import org.com.preparingOOD.creationalpatterns.prototype.shape.SpaceShip;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<SpaceShip> shapes = new ArrayList<>();
        List<SpaceShip> shapesCopy = new ArrayList<>();

        BattleShip battleShip = new BattleShip();
        battleShip.name = "Battle Ship";
        battleShip.speed = 300;
        battleShip.fuelCapacity = 100 ;
        battleShip.color = "Blue";
        battleShip.weaponCount = 10;
        battleShip.shieldCount = 200;
        shapes.add(battleShip);

        BattleShip anotherBattleShip = (BattleShip) battleShip.clone();
        shapes.add(anotherBattleShip);

        CargoShip cargoShip = new CargoShip();
        cargoShip.name = "Cargo Ship";
        cargoShip.speed = 150;
        cargoShip.fuelCapacity = 300;
        cargoShip.color = "Red";
        cargoShip.cargoCapacity = 500;
        cargoShip.hasRefrigeration = true;
        shapes.add(cargoShip);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<SpaceShip> spaceShips, List<SpaceShip> shapesCopy) {
        for (SpaceShip spaceShip : spaceShips) {
            shapesCopy.add(spaceShip.clone());
        }

        for (int i = 0; i < spaceShips.size(); i++) {
            if (spaceShips.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (spaceShips.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
