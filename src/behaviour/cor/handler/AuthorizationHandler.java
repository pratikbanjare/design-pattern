package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

public class AuthorizationHandler implements ProcessHandler {

    private ProcessHandler processHandler;

    public AuthorizationHandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    @Override
    public void process(Request request) throws PaymentProcessException {
        if (isValidOtp(request.getOtp())){
            System.out.println("Authorization Success");
            processHandler.process(request);
        } else {
            throw new PaymentProcessException("Authorization Failed");
        }
    }

    private boolean isValidOtp(String otp){
        return "123456".equalsIgnoreCase(otp);
    }
}
