package interfacedemo;

public class MovieBooking implements Booking{

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("Click here to book movie ticket");
	}

	@Override
	public void cancelTicket() {
		// TODO Auto-generated method stub
		System.out.println("Click here to cancel movie ticket");
	}

}
