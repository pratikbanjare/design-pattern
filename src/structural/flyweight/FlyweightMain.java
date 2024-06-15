package structural.flyweight;

public class FlyweightMain {

    public static void main (String[] args){

        GenericDocument document = new GenericDocument(new CharacterFlyweightFactory());

        document.addCharacter('a',1,"arbic","italic",0);
        document.addCharacter('b',2,"ariel","bold",1);
        document.addCharacter('c',3,"cortana","",2);
        document.addCharacter('d',4,"times new roman","bold",3);
        document.addCharacter('e',5,"papyrus","italic",4);

        document.display();


    }
}
