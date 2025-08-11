package org.com.preparingOOD.creationalpatterns.prototype.concreteShape;

import org.com.preparingOOD.creationalpatterns.prototype.shape.SpaceShip;

public class BattleShip extends SpaceShip {
    public int weaponCount ;
    public int shieldCount ;

    public BattleShip(BattleShip battleShip) {
        super(battleShip);
        if (battleShip != null) {
            this.weaponCount = battleShip.weaponCount;
            this.shieldCount = battleShip.shieldCount;
        }
    }

    public BattleShip() {
    }

    @Override
    public SpaceShip clone() {
        return new BattleShip(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof SpaceShip) || !super.equals(object2)) return false;
        BattleShip battleShip = (BattleShip) object2;
        return (battleShip.shieldCount == this.shieldCount)
                && (battleShip.weaponCount == weaponCount);
    }

}
