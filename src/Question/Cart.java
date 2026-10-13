package Question;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
        System.out.println(p.name + " added to cart");
    }

    public void removeProduct(Product p) {
        if (products.remove(p)) {
            System.out.println(p.name + " removed from cart");
        }
        else {
            System.out.println("Product not found");
        }
    }

    public double getTotalPrice() {
        double total = 0;

        for (int i = 0; i < products.size(); i++) {
            total = total + products.get(i).price;
        }

        return total;
    }

    public void display() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).display();
            System.out.println();
        }

        System.out.println("Total Price: " + getTotalPrice());
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1000);

        Cart c = new Cart();

        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p3);

        System.out.println();

        c.display();

        System.out.println();

        c.removeProduct(p2);

        System.out.println();
        c.display();
    }

}