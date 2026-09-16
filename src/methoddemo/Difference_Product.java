package methoddemo;

public class Difference_Product {
	
	public void Difference() {
	int a = 45;
	int b = 32;
	int difference = a - b ;
	System.out.println(difference);
	}
	
	public void Product() {
		int a = 45;
		int b = 32;
		int product = a * b ;
		System.out.println(product);
	}

	public static void main(String[] args) {
		Difference_Product obj = new Difference_Product();
		obj.Difference();
		obj.Product();
	}
}
