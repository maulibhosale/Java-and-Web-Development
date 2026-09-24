package overridingdemo;

public class ICICI extends Banks {

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("Interest rate for ICICI is ");
		return 4.2;
	}
	
}

