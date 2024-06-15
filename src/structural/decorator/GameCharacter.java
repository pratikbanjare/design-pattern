package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter implements IGameCharacter {

    private String name;
    private List<String> features;

    public GameCharacter(String name){
        this.name = name;
        features = new ArrayList<>();
        features.add("walk");
        features.add("jmmp");
        features.add("crawl");
        features.add("duck");
    }

    @Override
    public void showStats() {
        System.out.println("Basic Features - ");
        features.forEach(stat -> {
            System.out.println("\t-"+stat);
        });

    }

    @Override
    public void addStats(String stat) {
        features.add(stat);
    }
}
