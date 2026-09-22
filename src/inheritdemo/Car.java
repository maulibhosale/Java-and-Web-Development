package inheritdemo;

public class Car extends Vehicle {
	
	public void gett() {
		System.out.println("This is car class ");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		c.gett();
	}
	
}
