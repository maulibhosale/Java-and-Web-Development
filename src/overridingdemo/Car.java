package overridingdemo;

public class Car extends Vehicle {

	@Override
	public void display() {
		super.display();
		System.out.println("This is car");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.display();
	}

}
