package ParametrizedMethod;

public class Days {
	
	public void time(int days) {
		int hours = days * 24;
		int minutes = hours * 60;
		System.out.println(days + "days is equal to " + hours + "hours.");
		System.out.println(hours + "hours is equal to " + minutes + "minutes.");
	}
	
	public static void main(String[] args) {
		Days t = new Days();
		t.time(1);
		t.time(2);
		t.time(3);
		t.time(4);
	}

}
