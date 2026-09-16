package thiskeyword;

public class Product {
	String productName;
	double price;
	
	
	public void setProduct(String productName, double price) {
		this.productName = productName;
		this.price = price;
		
	}
	
	String storename;
	public void setStore(String storename) {
		System.out.println("Store name is ...." + storename);
	}
	
	public void display() {
		System.out.println("Product name is...." + productName);
		System.out.println("Price is...." + price);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product();
		
		p1.setProduct("Pen", 10.00);
		p1.display();
		
		p1.setStore("Shri Stores");
		p1.display();
		

	}
	

}