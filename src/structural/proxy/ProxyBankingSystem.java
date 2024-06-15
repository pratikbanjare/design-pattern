package structural.proxy;

public class ProxyBankingSystem implements IBakingSystem{

    private final String userRolw;
    private final IBakingSystem system = new BankingSystem();

    public ProxyBankingSystem(String userRolw) {
        this.userRolw = userRolw;
    }

    @Override
    public void deposit(int amount) {
        system.deposit(amount);

    }

    @Override
    public void withdraw(int amount) {
        if ("primary".equalsIgnoreCase(userRolw) || "admin".equalsIgnoreCase(userRolw)){
            system.withdraw(amount);
        } else {
            System.out.println("Unauthorized Withdrawl!!! Permission Denied");
        }

    }
}
