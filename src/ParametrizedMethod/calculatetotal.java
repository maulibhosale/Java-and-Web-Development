package ParametrizedMethod;

public class calculatetotal {
	
	public void product(int price) {
		double tax = price * 0.05;
		double total_amount = tax + price;
		System.out.println ("The total price is: " + total_amount);
	}
	
	public static void main(String[] args) {
		calculatetotal ta = new calculatetotal();
		ta.product(1000);
		ta.product(500);
	}

}
