package Question;

public class Order {

    static int counter = 0;
    int orderId;

    public Order() {
        counter++;
        orderId = counter;
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
    }

    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();

        o1.display();
        o2.display();
        o3.display();

        System.out.println("Total orders: " + counter);
    }

}
