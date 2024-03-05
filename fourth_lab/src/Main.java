import factories.AbstractFactory;
import factories.Goblins;
import factories.Orcs;
import units.UnitName;

public class Main {
    public static void main(String[] args) {
        createTroops(new Goblins());
        createTroops(new Orcs());
    }

    private static void createTroops (AbstractFactory factory) {
        factory.create(UnitName.SOLDIER);
        factory.create(UnitName.GENERAL);
        factory.create(UnitName.COMMANDER);
    }
}