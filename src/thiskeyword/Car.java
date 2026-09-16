package thiskeyword;

public class Car {
	
	String brand;
	int price;
	
	public Car(String brand) {
		this.brand=brand;
		this.price=500000;
		System.out.println(brand + " " + price);
	}
	
	public Car(String brand, int price) {
		this.brand=brand;
		this.price=price;
		System.out.println(brand + " " + price);
	}
	
	public static void main(String[] args) {
		Car c = new Car("VW");
	}

}
