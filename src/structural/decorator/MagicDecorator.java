package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class MagicDecorator extends BaseCharacterDecorator{

    private final List<String> magics;

    MagicDecorator(IGameCharacter gameCharacter) {
        super(gameCharacter);
        magics = new ArrayList<>();
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println("Magic Features - ");
        magics.forEach(stat -> {
            System.out.println("\t-"+stat);
        });

    }

    @Override
    public void addStats(String stat) {
        magics.add(stat);
    }
}
