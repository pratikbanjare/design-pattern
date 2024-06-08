package structural.adaptor;

public class Restraunt implements IRestraunt{
    @Override
    public void displayMenu(PandaMenu menu) {
        System.out.println("Display Full Menu.");
        System.out.println("Item - " + menu.getName() + ", price - " + menu.getPrice());
    }

    @Override
    public void displayRecommendation(PandaMenu menu) {
        System.out.println("Display recommendation from menu.");
        System.out.println("Item - " + menu.getName() + ", price - " + menu.getPrice());
    }
}
