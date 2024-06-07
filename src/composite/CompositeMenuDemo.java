package composite;

public class CompositeMenuDemo {

    public static void main (String[] args){

        Menu menu = new Menu("Main","/Main");

        MenuItem safetyItem = new MenuItem("Safety","/safety");
        menu.add(safetyItem);

        Menu claimsSubMenu = new Menu("Claims","/claims");
        menu.add(claimsSubMenu);

        MenuItem personalClaiMenu = new MenuItem("persomal claim","/personalclaim");
        claimsSubMenu.add(personalClaiMenu);
        claimsSubMenu.add(safetyItem);

        System.out.println(menu.toString());


    }
}
