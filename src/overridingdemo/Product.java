package overridingdemo;

public class Product {
	
	String name;
	double price;
	
	public Product(String name , double price) {
		this.name = name;
		this.price = price;
	}
	
	public double cal_discount() {
		return 0;
	}
	
	public void display() {
		double discount = cal_discount();
		double final_price = price - discount;
		
		System.out.println("Product name : " +name);
		System.out.println("Original Price : $" +price);
		System.out.println("Discount : $" +discount);
		System.out.println("Final Price : $" +final_price);
		System.out.println();
	}

}
