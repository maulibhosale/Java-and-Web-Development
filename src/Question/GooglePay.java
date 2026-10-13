package Question;

public class GooglePay extends PaymentGateway {

    @Override
    public void authenticateUser() {
        System.out.println("Google Pay user authenticated");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment made using Google Pay");
    }

}