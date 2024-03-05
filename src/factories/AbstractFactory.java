package factories;

import units.Unit;
import units.UnitName;
import units.commander.Commander;
import units.general.General;
import units.soldier.Soldier;

public interface AbstractFactory {
    default Unit create (UnitName unitName) {
       return switch (unitName) {
           case SOLDIER -> createSoldier();
           case GENERAL -> createGeneral();
           case COMMANDER -> createCommander();
        };
    }

    Commander createCommander();
    General createGeneral();
    Soldier createSoldier();
}
