package userinput;

import java.util.Scanner;

public class SumAndProduct {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    
	    int sum = a + b + c;
	    int product = a * b * c;
	    
	    System.out.println("Sum of this numbers is: " + sum);
	    System.out.println("Product of this numbers is: " + product);
	    
	}

}
