package ParametrizedMethod;

public class Address {
	
	public void add(int house_number, String city, String state) {
		System.out.println("Full address:- " + "House number " + house_number +" "+ city +" "+ "city" +" "+ state +" "+ "state");
	}
	
	public static void main(String[] args) {
		Address a = new Address();
		a.add(101, "Pune", "Maharashtra");
		a.add(120, "Chennai", "Tamilnadu");
		a.add(210, "Panjim", "Goa");
	}

}
