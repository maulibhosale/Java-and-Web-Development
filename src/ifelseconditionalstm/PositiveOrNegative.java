package ifelseconditionalstm;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = n.nextInt();
		
		if (num >= 0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
		
		}
	
}
