package structural.adaptor.fancy;

public class GenericRestraunt {

    public void displayGenericMenu (GenericMenu menu){
        System.out.println("Display Generic Menu");
        System.out.println("Item - " + menu.getName() + ", price - " + menu.getPrice());
    }

    public void displayGenericRecommendations (GenericMenu menu){
        System.out.println("Display Generic Recommendations");
        System.out.println("Item - " + menu.getName() + ", price - " + menu.getPrice());
    }

}
