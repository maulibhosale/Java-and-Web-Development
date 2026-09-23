package Questions;

public class ElectronicProduct extends Products{
	
	String Brand;
	int WarrantyPeriod ;

	public void gett(String Brand, int WarrantyPeriod) {
		this.Brand = Brand;
		this.WarrantyPeriod = WarrantyPeriod;
		System.out.println("Brand: " +Brand);
		System.out.println("Warranty Period: " +WarrantyPeriod+ " months.");
	}
	
	public static void main(String[] args) {
		ElectronicProduct e = new ElectronicProduct();
		e.display("Mobile", 1001, 80000);
		e.gett("Samsung", 12);
	}
	
}
