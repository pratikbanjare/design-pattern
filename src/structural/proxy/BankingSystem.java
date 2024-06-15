package structural.proxy;

public class BankingSystem implements IBakingSystem{
    @Override
    public void deposit(int amount) {
        System.out.println("Depositing amount "+amount);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Withdrawl of amount "+amount);
    }
}
