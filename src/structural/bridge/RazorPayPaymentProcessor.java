package structural.bridge;

public class RazorPayPaymentProcessor implements PaymentProcessor{
    @Override
    public void openSecureChannel() {
        System.out.println("Razorpay - opening Secure Channel");
    }

    @Override
    public void performPayment() {
        System.out.println("Razorpay - Performing payment");
    }

    @Override
    public void closeSecureChannel() {
        System.out.println("Razorpay - Closing Secure Channel");

    }
}
