package Questions;

public class Smartphone extends Product {

	String operatingSystem = "Android" ;
	double screenSize = 120.00 ;
	
	public void runApp() {
		System.out.println(ProductName+ " is running " +operatingSystem + " OS");
	}
	
	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.runApp();
		s.displayPrice();
		s.checkWarranty();
	}
}
