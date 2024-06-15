package structural.proxy;

public class ProxyMain {

    public static void main(String[] args) {

        IBakingSystem system = new ProxyBankingSystem("primary");
        system.deposit(1000);
        system.withdraw(2000);

        IBakingSystem seconday = new ProxyBankingSystem("seconday");
        seconday.withdraw(100);

        IBakingSystem admin = new ProxyBankingSystem("admin");
        admin.withdraw(100);

    }
}
