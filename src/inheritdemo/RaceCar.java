package inheritdemo;

public class RaceCar extends Automobile {
	
	public void gett() {
		System.out.println("This is a Race Car ");
	}
	
	public void give(int cylinder) {
		System.out.println("This race car have " +cylinder+ " cylinder");
		
	}

	public static void main(String[] args) {
		RaceCar c = new RaceCar();
		c.display();
		c.gett();
		c.give(6);
	}

}
