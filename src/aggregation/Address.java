package aggregation;

public class Address {
	
	String city;
	String state;
	String country;
	
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;	
	}
	
	public String toString() {
		return "Address [city= " +city+ " , state=" +state+ ", country=" +country+ "]" ;
	}
	
	public void printvalue() {
		System.out.println(city);
		System.out.println(state);
		System.out.println(country);
	}

}
