package behaviour.mediator.character;

public abstract class Character {

    private String name;

    public Character(String name) {
        this.name = name;
    }

    public abstract void leftPuch();
    public abstract void rightPuch();
    public abstract void leftLeg();
    public abstract void rightLeg();
    public abstract void jump();

    public String getName() {
        return name;
    }
}
