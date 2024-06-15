package structural.flyweight;

public class CharacterContext {

    private CharacterFlyweight characterFlyweight;
    private int pos;

    public CharacterContext(CharacterFlyweight characterFlyweight, int pos) {
        this.characterFlyweight = characterFlyweight;
        this.pos = pos;
    }

    public void display() {
        characterFlyweight.display(this.pos);
    }
}
