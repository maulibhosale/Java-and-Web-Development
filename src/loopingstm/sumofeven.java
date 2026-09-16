package loopingstm;

public class sumofeven {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i=2 ; i<=10 ; i+=2) {
			sum = sum + i;	
		}
		System.out.println("Sum of even number is : ");
		System.out.println(sum);
		
	}
	
}
