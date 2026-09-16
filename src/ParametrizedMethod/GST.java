package ParametrizedMethod;

public class GST {
	
	public void product(int price, int rate) {
		int amount = (price * rate) / 100;
		System.out.println ("The GST Amount for the following product is: " + amount);
	}
	
	public static void main(String[] args) {
		GST amt = new GST();
		amt.product(300, 18);
		amt.product(140, 5);
		amt.product(800, 12);
	}

}
