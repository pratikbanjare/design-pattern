package behaviour.cor.handler;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.model.Request;

import java.util.Objects;

public class AuthenticationHandler implements ProcessHandler{

    private ProcessHandler processHandler;

    public AuthenticationHandler(ProcessHandler processHandler) {
        this.processHandler = processHandler;
    }

    @Override
    public void process(Request request) throws PaymentProcessException {
        if (authenticate(request)){
            if (!Objects.isNull(processHandler)){
                System.out.println("Authentication Success");
                processHandler.process(request);
            }
        } else {
            throw new PaymentProcessException("Authentication Failed");
        }
    }

    private boolean authenticate(Request request) {
        if ("valid".equalsIgnoreCase(request.getAuthenticationKey())){
            return true;
        }
        return false;
    }
}
