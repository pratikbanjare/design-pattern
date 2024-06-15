package structural.bridge;

public class BridgeMain {

    public static void main (String[] args) {

        PaymentService paymentService = new PaymentService(new RazorPayPaymentProcessor());

        paymentService.openSecureChannel();
        paymentService.performPayment();
        paymentService.closeSecureChannel();

        System.out.println();

        PaymentService paymentService1 = new PaymentService(new JusPayPaymentProcessor());

        paymentService1.openSecureChannel();
        paymentService1.performPayment();
        paymentService1.closeSecureChannel();

    }
}
