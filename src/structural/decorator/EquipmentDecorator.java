package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class EquipmentDecorator extends BaseCharacterDecorator{

    private final List<String> equipments;

    EquipmentDecorator(IGameCharacter gameCharacter) {
        super(gameCharacter);
        equipments = new ArrayList<>();
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println("Equpments - ");
        equipments.forEach(stat -> {
            System.out.println("\t - " + stat);
        });
    }

    @Override
    public void addStats(String stat) {
        equipments.add(stat);
    }
}
