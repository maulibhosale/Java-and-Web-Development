package interfacedemo;

public class CarRide implements Ride {

	final double rate_per_km = 12.5;
	double total;
	
	@Override
	public void bookRide(String pickup, String destination) {
		// TODO Auto-generated method stub
		System.out.println("Car ride booked from " +pickup+ " to " +destination+ ".");
	}

	@Override
	public void calculateFare(double distanceInKm) {
		// TODO Auto-generated method stub
		total = rate_per_km * distanceInKm ;
		System.out.println("Total fare: " +total);
	}
	
	public static void main(String[] args) {
		System.out.println("Ride Booking System");
		
		System.out.println();
		CarRide cr = new CarRide();
		cr.bookRide("Lohegaon", "Charholi");
		cr.calculateFare(8.5);

		System.out.println();
		BikeRide br = new BikeRide();
		br.bookRide("Lohegaon", "Khadakwasla");
		br.calculateFare(22);
	}

}
