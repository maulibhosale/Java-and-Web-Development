package constructors;

public class Interest {

	public Interest(int principal, double rate, int time) {
		double si = (principal * rate * time ) / 100;
		System.out.println(si);
	}
	
	public static void main(String[] args) {
		Interest i = new Interest(10000, 3.2, 12);
	}
	
}
