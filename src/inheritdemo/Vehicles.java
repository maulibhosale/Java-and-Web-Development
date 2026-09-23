package inheritdemo;

// Vehicle System

public class Vehicles {
	
	String brand;
    String model;
    int speed;

	public void display(String brand, String model, int speed ) {
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		
		System.out.println("Vehicles System:- ");
		System.out.println("Brand: " +brand);
		System.out.println("Model: " +model);
		System.out.println("Speed: " +speed);
		
	}
}
