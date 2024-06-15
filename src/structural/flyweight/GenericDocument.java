package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class GenericDocument {

    private List<CharacterContext> characterContexts = new ArrayList<>();

    private CharacterFlyweightFactory characterFlyweightFactory;

    public GenericDocument(CharacterFlyweightFactory characterFlyweightFactory) {
        this.characterFlyweightFactory = characterFlyweightFactory;
    }

    public void addCharacter (char symbol, int size, String font, String style, int pos){
        CharacterFlyweight flyweight = characterFlyweightFactory.getCharacter(symbol,size, font, style);
        CharacterContext characterContext = new CharacterContext(flyweight, pos);
        characterContexts.add(characterContext);
    }

    public void display (){
        characterContexts.forEach(characterContext -> {
            characterContext.display();
        });
    }
}
