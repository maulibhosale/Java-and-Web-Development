package Question;

public class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }

}
