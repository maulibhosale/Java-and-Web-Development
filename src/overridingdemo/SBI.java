package overridingdemo;

public class SBI extends Banks {

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("Interest rate for SBI is ");
		return 3.3;
	}

	
	
}
