package Question;

public class Account {

    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a = new Account(101, 5000);
        a.display();
    }

}
