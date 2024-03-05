package factories;

import units.commander.Commander;
import units.commander.OrcCommander;
import units.general.General;
import units.general.OrcGeneral;
import units.soldier.OrcSoldier;
import units.soldier.Soldier;

public class Orcs implements AbstractFactory{
    @Override
    public Commander createCommander() {
        return new OrcCommander();
    }

    @Override
    public General createGeneral() {
        return new OrcGeneral();
    }

    @Override
    public Soldier createSoldier() {
        return new OrcSoldier();
    }
}
