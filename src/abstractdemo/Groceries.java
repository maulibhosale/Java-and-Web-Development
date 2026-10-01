package abstractdemo;

public class Groceries extends Product {

	public Groceries(String name, double price) {
		super(name, price);
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		Electronics e = new Electronics("Mobile", 10000);
		e.calculateTotalPrice();
		
		System.out.println();
		
		Clothing c = new Clothing("Jacket", 2500);
		c.calculateTotalPrice();
		
		System.out.println();
		
		Groceries g = new Groceries("Rice", 1000);
		g.calculateTotalPrice();
		
	}
	
}
	