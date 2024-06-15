package structural.adaptor;

import structural.adaptor.fancy.GenericMenu;
import structural.adaptor.fancy.GenericRestraunt;

public class GenericAdaptor implements IRestraunt{

    private final GenericRestraunt restraunt;

    public GenericAdaptor(GenericRestraunt restraunt) {
        this.restraunt = restraunt;
    }

    @Override
    public void displayMenu(PandaMenu menu) {
        restraunt.displayGenericMenu(
                convertPandaMenuToGenericMenu(menu)
        );

    }

    @Override
    public void displayRecommendation(PandaMenu menu) {
        restraunt.displayGenericRecommendations(
                convertPandaMenuToGenericMenu(menu)
        );

    }

    private GenericMenu convertPandaMenuToGenericMenu ( PandaMenu menu ){
        GenericMenu genericMenu = new GenericMenu();
        genericMenu.setName(menu.getName());
        genericMenu.setPrice( Double.parseDouble(menu.getPrice()) );
        return genericMenu;
    }
}
