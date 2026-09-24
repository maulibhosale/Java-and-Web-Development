package overridingdemo;

public class HDFC extends Banks {

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("Interest rate for HDFC is ");
		return 4.2;
	}
	
	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s.getInterestRate());
		
		System.out.println();
		
		HDFC h = new HDFC();
		System.out.println(h.getInterestRate());
		
		System.out.println();
		
		ICICI i = new ICICI();
		System.out.println(i.getInterestRate());
		
	}
	
}
