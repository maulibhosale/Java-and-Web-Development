package returnstmrmethod;

public class Product {
	
	public int display(int a, int b, int c) {
		return a*b*c ;
	}
	
	public static void main(String[] args) {
		
		Product p = new Product();
		System.out.println(p.display(3, 2, 4));
	}

}
