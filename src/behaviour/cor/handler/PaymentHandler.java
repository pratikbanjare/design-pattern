package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

public class PaymentHandler implements ProcessHandler{

    private ProcessHandler processHandler;

    public PaymentHandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    @Override
    public void process(Request request) throws PaymentProcessException {

        if (payment(request)){
            System.out.println("Requested Payment Success");
            this.processHandler.process(request);
        } else {
            throw new PaymentProcessException("Payment failed at process stage");
        }
    }

    private boolean payment(Request request) {
        return true;
    }
}
