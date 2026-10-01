package abstractdemo;

public abstract class Product {

	String name;
	double price;
	
	

	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}

	public abstract double calculateDiscount();
	
	public void calculateTotalPrice() {
		
        double discount = calculateDiscount();
        double totalPrice = price - discount;

        System.out.println("Product: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println();
    } 

}
