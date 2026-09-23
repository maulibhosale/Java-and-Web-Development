package inheritdemo;

public class Cars extends Vehicles { 
	
	int numberOfDoors;
	
	public void gett(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
		System.out.println("Car have " +numberOfDoors+ " number of doors.");
	}

}
