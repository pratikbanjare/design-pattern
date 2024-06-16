package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

import java.util.Arrays;
import java.util.List;

public class ValidationHandler implements ProcessHandler{

    private ProcessHandler processHandler;

    public ValidationHandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    @Override
    public void process(Request request) throws PaymentProcessException {
        if (isValidAccount(request.getAccount())){
            System.out.println("Validation Success");
            ;processHandler.process(request);
        }else {
            throw new PaymentProcessException("Process failed at validation stage");
        }
    }

    private boolean isValidAccount(String account) {
        return listOfAccounts().contains(account);
    }

    private List<String> listOfAccounts(){
        return Arrays.asList(
                "ACX1234",
                "ACX4567",
                "ACX7689"
        );
    }

}
