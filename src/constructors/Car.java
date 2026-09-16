package constructors;

public class Car {

	public Car(String brand, int price) {
		System.out.println(brand + " car is of " + price + " Rupees");
	}
	
	public static void main(String[] args) {
		Car c = new Car("Tata", 1000000);
	}
	
}
