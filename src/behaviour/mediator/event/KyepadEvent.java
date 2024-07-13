package behaviour.mediator.event;

import behaviour.mediator.character.Character;

public class KyepadEvent implements IKeypadEvent{


    private Character character;

    public KyepadEvent(Character character) {
        this.character = character;
    }

    @Override
    public void buttonPressA() {
        character.leftLeg();
    }

    @Override
    public void buttonPressB() {
        character.rightLeg();
    }

    @Override
    public void buttonPressX() {
        character.leftPuch();

    }

    @Override
    public void buttonPressY() {
        character.rightPuch();

    }

    @Override
    public void buttonPressRB() {

    }

    @Override
    public void buttonPressLB() {

    }

    @Override
    public void buttonPressRT() {

    }

    @Override
    public void buttonPressLT() {

    }
}
