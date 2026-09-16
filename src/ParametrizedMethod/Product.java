package ParametrizedMethod;

public class Product {
	
	public void pro(int a,int b, int c) {
		int product = a * b * c;
		System.out.println("Product = " + product);
	}
	
	public static void main(String[] args) {
		Product p = new Product();
		p.pro(3, 4, 5);
		p.pro(4, 8, 9);
	}

}
