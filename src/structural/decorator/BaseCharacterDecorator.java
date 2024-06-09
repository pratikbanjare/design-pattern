package structural.decorator;

public abstract class BaseCharacterDecorator  implements IGameCharacter {

    private final IGameCharacter gameCharacter;

    BaseCharacterDecorator(IGameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public void showStats() {
        gameCharacter.showStats();

    }

    @Override
    public void addStats(String stat) {
        gameCharacter.addStats(stat);
    }
}
