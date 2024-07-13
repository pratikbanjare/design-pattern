package behaviour.mediator;

import behaviour.mediator.character.Character;
import behaviour.mediator.character.Jin;
import behaviour.mediator.character.Kaguya;
import behaviour.mediator.event.IKeypadEvent;
import behaviour.mediator.event.KyepadEvent;

public class MediatorMain {

    public static void main(String[] args) {

        Character jin = new Jin();
        Character kaguya = new Kaguya();

        IKeypadEvent jinEvent = new KyepadEvent(jin);
        IKeypadEvent kaguyaEvent = new KyepadEvent(kaguya);

        jinEvent.buttonPressA();
        jinEvent.buttonPressB();
        jinEvent.buttonPressX();
        jinEvent.buttonPressY();
        kaguyaEvent.buttonPressA();
        kaguyaEvent.buttonPressB();
        kaguyaEvent.buttonPressX();
        kaguyaEvent.buttonPressY();
    }
}
