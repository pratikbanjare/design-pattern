package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

public class Notificationhandler implements ProcessHandler{

    private ProcessHandler processHandler;

    public Notificationhandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    @Override
    public void process(Request request) throws PaymentProcessException {

        System.out.println("Sending Notification to user...");
        this.processHandler.process(request);

    }
}
