package units.general;

import units.Unit;

public abstract class General implements Unit {
    protected int hp;
    @Override
    public void attack() {
        System.out.println("general attack enemy");
    }

    @Override
    public void takeDamage() {
        System.out.println("general got injured by enemy");
    }
}
