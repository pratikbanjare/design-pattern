package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CharacterFlyweightFactory {

    private Map<String, CharacterFlyweight> flyweight = new HashMap<>();


    public CharacterFlyweight getCharacter (char symbol, int size, String font, String style){
        String key = symbol+size+font+style;
        CharacterFlyweight character  = flyweight.get(key);
        if (Objects.isNull(character)){
            character = new CharacterFlyweight(symbol,size,font,style);
            flyweight.put(key,character);
        }
        return character;
    }


}
