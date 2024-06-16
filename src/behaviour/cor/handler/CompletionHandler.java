package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

public class CompletionHandler implements ProcessHandler{
    @Override
    public void process(Request request) throws PaymentProcessException {
        System.out.println("Payment Completed - "+request.toString());
    }
}
