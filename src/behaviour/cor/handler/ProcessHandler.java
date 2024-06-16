package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

public interface ProcessHandler {

    public void process(Request request) throws PaymentProcessException;

}
