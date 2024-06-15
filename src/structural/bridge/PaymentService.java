package structural.bridge;

public class PaymentService {

    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    
    public void openSecureChannel() {
        paymentProcessor.openSecureChannel();
    }

    
    public void performPayment() {
        paymentProcessor.performPayment();
    }

    
    public void closeSecureChannel() {
        paymentProcessor.closeSecureChannel();

    }
}
