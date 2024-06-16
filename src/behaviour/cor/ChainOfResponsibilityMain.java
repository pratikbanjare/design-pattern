package behaviour.cor;

import behaviour.cor.exception.PaymentProcessException;
import behaviour.cor.handler.*;
import behaviour.cor.model.PaymentAction;
import behaviour.cor.model.Request;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {

        AuthorizationHandler hanlder = createHanlder();
        try {

            Request request = new Request("pratik", "10000", PaymentAction.DEPOSIT,
                    "valid", "123456", "ACX");
            hanlder.process(request);

        } catch (PaymentProcessException e) {
            throw new RuntimeException(e);
        }



        try {
            Request request2 = new Request("pratik", "10000", PaymentAction.WITHDRAW,
                    "valid", "123456", "ACX");
            hanlder.process(request2);
        } catch (PaymentProcessException e) {
            throw new RuntimeException(e);
        }

        try {
            Request request2 = new Request("pratik", "10000", PaymentAction.WITHDRAW,
                    "valid", "12345", "ACX");
            hanlder.process(request2);
        } catch (PaymentProcessException e) {
            throw new RuntimeException(e);
        }

    }

    private static AuthorizationHandler createHanlder() {
        return new AuthorizationHandler(
                new AuthorizationHandler(
                        new FraudDetectionHandler(
                                new FundCheckHandler(
                                        new PaymentHandler(
                                                new Notificationhandler(
                                                        new CompletionHandler()
                                                )
                                        )
                                )
                        )
                )
        );
    }
}
