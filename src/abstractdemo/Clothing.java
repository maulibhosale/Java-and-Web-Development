package abstractdemo;

public class Clothing extends Product {

	public Clothing(String name, double price) {
		super(name, price);
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		if(price > 2000) {
			return price * 0.20;
		}
		return 0;
	}
	

}