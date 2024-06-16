package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

public class FraudDetectionHandler implements ProcessHandler{

    private ProcessHandler processHandler;

    public FraudDetectionHandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    @Override
    public void process(Request request) throws PaymentProcessException {
        if (!fraudRuleCheck(request)){
            System.out.println("Fraud check passed");
            this.processHandler.process(request);
        } else {
            throw new PaymentProcessException("Faundulent activity detected");
        }
    }

    private boolean fraudRuleCheck(Request request) {
        return false;
    }
}
