package interfacedemo;

public class TrainBooking implements Booking{

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("Click here to book train ticket");
	}

	@Override
	public void cancelTicket() {
		// TODO Auto-generated method stub
		System.out.println("Click here to cancel train ticket");
	}
	
	public static void main(String[] args) {
		TrainBooking t = new TrainBooking();
		t.bookTicket();
		t.cancelTicket();
		
		System.out.println();
		
		MovieBooking m = new MovieBooking();
		m.bookTicket();
		m.cancelTicket();
	}

}
