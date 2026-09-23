package inheritdemo;

public class Bikes extends Vehicles{
	
	int seats;
	
	public void give(int seats) {
		this.seats = seats;
		System.out.println("Bike has " +seats+" seats.");
	}
	
	public static void main(String[] args) {
		Vehicles v = new Vehicles();
		v.display("Honda", "City", 200);
		
		Cars c = new Cars();
		c.gett(4);
		
		Bikes b = new Bikes();
		b.give(2);
	}

}
