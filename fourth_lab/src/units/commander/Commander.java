package units.commander;

import units.Unit;

public abstract class Commander implements Unit {

    protected int hp;
    @Override
    public void attack() {
        System.out.println("soldier attack enemy");
    }

    @Override
    public void takeDamage() {
        System.out.println("soldier got injured by enemy");
    }
    public void command() {
        System.out.println("Commander give command");
    }
}
