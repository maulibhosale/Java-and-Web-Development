package ifelseifstm;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Number is positive.");
			if(num % 2 == 0) {
				System.out.println("Number is even");
			}
			else {
				System.out.println("Number is odd");
			}
		}
		else if (num < 0) {
			System.out.println("Number is negative.");
		}
		else {
			System.out.println("Number is equal to zero.");
		}
		
	}

}
