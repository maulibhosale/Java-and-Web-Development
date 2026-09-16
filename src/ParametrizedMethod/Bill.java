package ParametrizedMethod;

public class Bill {
	
	public void number(int price, int quantity) {
		int bill = price * quantity;
		System.out.println ("Your total bill is : " + bill + "rupees.");
	}
	
	public static void main(String[] args) {
		Bill tb = new Bill();
		tb.number(30, 2);
		tb.number(54, 4);
		tb.number(7, 10);
	}

}
