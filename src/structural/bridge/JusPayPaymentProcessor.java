package structural.bridge;

public class JusPayPaymentProcessor implements PaymentProcessor{

    @Override
    public void openSecureChannel() {
        System.out.println("JusPay - opening Secure Channel");
    }

    @Override
    public void performPayment() {
        System.out.println("JusPay - Performing payment");
    }

    @Override
    public void closeSecureChannel() {
        System.out.println("JusPay - Closing Secure Channel");

    }
}
