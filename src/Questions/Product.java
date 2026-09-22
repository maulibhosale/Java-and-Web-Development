package Questions;

public class Product {
	
	
	String ProductName = "Oppo" ;
	double Price = 1000.00 ;
	int WarrantyMonths = 10 ;
	
	public void displayPrice() {
		System.out.println("The price is $" +Price);
	}
	
	public void checkWarranty() {
		System.out.println("Warranty: " +WarrantyMonths+ " months.");
	}
	
	
}
