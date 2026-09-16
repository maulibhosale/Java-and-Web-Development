package returnstmrmethod;

public class Addition {
	
	public double add(int a, int b) {
		double sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		System.out.println(ad.add(12, 10));
		System.out.println(ad.add(63, 17));
	}
}
