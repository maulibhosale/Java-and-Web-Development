package Question;

public class EmailNotifier implements Notifier {

    String message;

    public EmailNotifier(String message) {
        this.message = message;
    }

    @Override
    public void notifyUser() {
        System.out.println("Email notification: " + message);
    }

    public static void main(String[] args) {
        EmailNotifier e = new EmailNotifier("Your order is confirmed");
        e.notifyUser();

        SMSNotifier s = new SMSNotifier("Your OTP is 1234");
        s.notifyUser();
    }

}