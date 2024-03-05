package units.soldier;

import units.Unit;

public abstract class Soldier implements Unit {
    protected int hp;
    @Override
    public void attack() {
        System.out.println("soldier attack enemy");
    }

    @Override
    public void takeDamage() {
        System.out.println("soldier got injured by enemy");
    }

    public void desert () {
        System.out.println("soldier run from fight");
    }
}
