package loopingstm;

public class sumofnumbers {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i=1; i<=20; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("Sum of the above numbers is: ");
		System.out.println(sum);
		
	}

}
