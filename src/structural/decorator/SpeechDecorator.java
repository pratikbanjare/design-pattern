package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class SpeechDecorator extends BaseCharacterDecorator{

    private final List<String> speaches;

    SpeechDecorator(IGameCharacter gameCharacter) {
        super(gameCharacter);
        speaches = new ArrayList<>();
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println("Speech Features - ");
        speaches.forEach(stat -> {
            System.out.println("\t-"+stat);
        });

    }

    @Override
    public void addStats(String stat) {
        speaches.add(stat);
    }

}
