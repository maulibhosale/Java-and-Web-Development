package returnstmrmethod;

public class Employee {
	
	public double display(double bs) {
		
		double da = 0.10 * bs;
		double hra = 0.15 * bs;
		double gross = bs+da+hra;
		return gross;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e.display(50000));
	}

}
