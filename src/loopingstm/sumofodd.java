package loopingstm;

public class sumofodd {


	public static void main(String[] args) {
		
		int sum = 0;
		for (int i=1 ; i<=10 ; i+=2) {
			sum = sum + i;	
			System.out.println(i);
		}
		System.out.println("Sum of odd number is : ");
		System.out.println(sum);
		
	}
	
}	
	

