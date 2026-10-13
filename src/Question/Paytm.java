package Question;

public class Paytm extends PaymentGateway {

    @Override
    public void authenticateUser() {
        System.out.println("Paytm user authenticated");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment made using Paytm");
    }

    public static void main(String[] args) {

        GooglePay g = new GooglePay();
        g.authenticateUser();
        g.makePayment();

        System.out.println();

        PhonePe p = new PhonePe();
        p.authenticateUser();
        p.makePayment();

        System.out.println();

        Paytm pt = new Paytm();
        pt.authenticateUser();
        pt.makePayment();
    }

}
