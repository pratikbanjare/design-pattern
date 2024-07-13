package behaviour.mediator.character;

public class Jin extends Character {

    public Jin() {
        super("JIN");
    }

    @Override
    public void leftPuch() {
        System.out.println(this.getName() + " animation sequence - left punch");
    }

    @Override
    public void rightPuch() {
        System.out.println(this.getName() + " animation sequence - right punch");
    }

    @Override
    public void leftLeg() {
        System.out.println(this.getName() + " animation sequence - left kick");
    }

    @Override
    public void rightLeg() {
        System.out.println(this.getName() + " animation sequence - right kick");
    }

    @Override
    public void jump() {

    }
}
