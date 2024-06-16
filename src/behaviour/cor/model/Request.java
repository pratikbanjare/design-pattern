package behaviour.cor.model;

public class Request {

    private String name;
    private String amount;
    private PaymentAction action;
    private String authenticationKey;
    private String otp;
    private String account;

    public Request(String name, String amount, PaymentAction action, String authenticationKey, String otp, String account) {
        this.name = name;
        this.amount = amount;
        this.action = action;
        this.authenticationKey = authenticationKey;
        this.otp = otp;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public PaymentAction getAction() {
        return action;
    }

    public String getAuthenticationKey() {
        return authenticationKey;
    }

    public String getOtp() {
        return otp;
    }

    public String getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return name + " " + amount + " " + action + " " + account;
    }
}
