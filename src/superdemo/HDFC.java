package superdemo;

public class HDFC extends Bank {
	
	public void rules(int a) {
		super.rules();
		System.out.println();
		System.out.println("HDFC Bank Rules:- ");
		System.out.println("Minimum Balance 100$");
		System.out.println("KYC required");
	}
	
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.rules(3);
	}

}
