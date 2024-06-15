package structural.bridge;

public interface PaymentProcessor {

    public void openSecureChannel();
    public void performPayment();
    public void closeSecureChannel();
}
