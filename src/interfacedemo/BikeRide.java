package interfacedemo;

public class BikeRide implements Ride {

	final double rate_per_km = 8.5;
	double total;
	
	@Override
	public void bookRide(String pickup, String destination) {
		// TODO Auto-generated method stub
		System.out.println("Bike ride booked from " +pickup+ " to " +destination+ ".");
	}

	@Override
	public void calculateFare(double distanceInKm) {
		// TODO Auto-generated method stub
		total = rate_per_km * distanceInKm ;
		System.out.println("Total fare: " +total);
	}

}
