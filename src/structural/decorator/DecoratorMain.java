package structural.decorator;

public class DecoratorMain {

    public static void main (String[] args){

        IGameCharacter character = new GameCharacter("Alucard");

        character.addStats("hold");
        character.showStats();

        System.out.println("-------------------------X---------------------------");
        System.out.println();

        IGameCharacter equipmentDecorator = new EquipmentDecorator(character);
        equipmentDecorator.addStats("Spear");
        equipmentDecorator.addStats("Knives");
        equipmentDecorator.addStats("katana");
        equipmentDecorator.showStats();

        System.out.println("-------------------------X---------------------------");
        System.out.println();

        /*
        Notice the difference when we pass 'character' object to Speechdecorator
        and when we are passing 'equipmentDecorator' to Magicdecorator
         */
        IGameCharacter speachDecorator = new SpeechDecorator(character);
        speachDecorator.addStats("Bargain");
        speachDecorator.addStats("Flirt");
        speachDecorator.showStats();

        System.out.println("-------------------------X---------------------------");
        System.out.println();

        IGameCharacter magicDecorator = new MagicDecorator(equipmentDecorator);
        magicDecorator.addStats("Fire");
        magicDecorator.addStats("Lightning");
        magicDecorator.showStats();


    }
}
