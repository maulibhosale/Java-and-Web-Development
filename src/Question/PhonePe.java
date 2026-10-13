package Question;

public class PhonePe extends PaymentGateway {

    @Override
    public void authenticateUser() {
        System.out.println("PhonePe user authenticated");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment made using PhonePe");
    }

}