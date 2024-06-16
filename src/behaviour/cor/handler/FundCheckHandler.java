package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

import static behaviour.cor.model.PaymentAction.*;

public class FundCheckHandler implements ProcessHandler{

    private ProcessHandler processHandler;

    public FundCheckHandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    @Override
    public void process(Request request) throws PaymentProcessException {

        if (( WITHDRAW.equals(request.getAction()) && checkFunds(request.getAccount()) || DEPOSIT.equals(request.getAction()))) {
            System.out.println("Fund check Success");
            this.processHandler.process(request);
        } else {
            throw new PaymentProcessException("unable to perform provided action!!!");
        }

    }

    private boolean checkFunds(String account) {
        return true;
    }
}
