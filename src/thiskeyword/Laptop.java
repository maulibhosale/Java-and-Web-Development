package thiskeyword;

public class Laptop {
	
	String brand;
	int price;
	
	public Laptop(String brand, int price) {
		this.brand=brand;
		this.price=price;
		System.out.println(brand + " " + price);
	}
	
	public Laptop(String brand) {
		this.brand=brand;
		System.out.println(brand);
	}
	
	public Laptop() {
		System.out.println("Default Laptop");
	}

	public static void main(String[] args) {
		Laptop l = new Laptop("Dell", 50000);
	}
}
