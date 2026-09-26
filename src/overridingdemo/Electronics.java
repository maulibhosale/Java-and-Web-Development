package overridingdemo;

public class Electronics extends Product{
	
	public Electronics(String name, double price) {
		super(name, price);
	}

	@Override
	public double cal_discount() {
		// TODO Auto-generated method stub
		return price * 0.10;
	}

}
