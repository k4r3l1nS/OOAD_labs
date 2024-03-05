package factories;

import units.commander.Commander;
import units.commander.GoblinCommander;
import units.general.General;
import units.general.GoblinGeneral;
import units.soldier.GoblinSoldier;
import units.soldier.Soldier;

public class Goblins implements AbstractFactory{


    @Override
    public Commander createCommander() {
        return new GoblinCommander();
    }

    @Override
    public General createGeneral() {
        return new GoblinGeneral();
    }

    @Override
    public Soldier createSoldier() {
        return new GoblinSoldier();
    }
}
