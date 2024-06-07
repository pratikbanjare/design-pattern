package composite;

import java.util.Iterator;

public class Menu extends MenuComponent{

    public Menu (String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public MenuComponent add (MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove (MenuComponent component){
        menuComponents.remove(component);
        return component;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(print(this));

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent com = iterator.next();
            builder.append(com.toString());
        }
        return builder.toString();
    }
}
