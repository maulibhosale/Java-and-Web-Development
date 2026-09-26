package overridingdemo;

public class Groceries extends Product {
    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public double cal_discount() {
        return 0.0; 
    }
    
    public static void main(String[] args) {
    	Product p1 = new Electronics("Smartphone", 25000.0);
        Product p2 = new Clothing("Jacket", 3500.0);
        Product p3 = new Clothing("T-Shirt", 1200.0);
        Product p4 = new Groceries("Wheat Flour", 400.0);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
	
}