package structural.adaptor;

import structural.adaptor.fancy.GenericRestraunt;

public class MainAdaptor {

    public static void main (String[] args){

        /*
        Existing display system for restraunt
         */
        PandaMenu menu = new PandaMenu("rasmalai"," 10.0");
        IRestraunt restraunt = new Restraunt();
        restraunt.displayRecommendation(menu);
        System.out.println();
        restraunt.displayMenu(menu);

        System.out.println();
        System.out.println();

        /*
        After finding better display package 'GenericRestraunt', we are to use functions of that class to display menus and other
        As GenericRestraunt takes GenericMenu as input, not PandaMenu,
        we hae to create an adaptor that can transform panda menu to Generic Menu
         */

        GenericAdaptor genericAdaptor =  new GenericAdaptor(new GenericRestraunt());
        genericAdaptor.displayRecommendation(menu);
        System.out.println();
        genericAdaptor.displayMenu(menu);



    }
}
