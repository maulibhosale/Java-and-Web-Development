package Question;

public class SMSNotifier implements Notifier {

    String message;

    public SMSNotifier(String message) {
        this.message = message;
    }

    @Override
    public void notifyUser() {
        System.out.println("SMS notification: " + message);
    }

}