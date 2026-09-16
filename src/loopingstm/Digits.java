package loopingstm;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <=9) {
			System.out.println("one digit number.");
		}
		else if(num >= 10 && num <=99) {
			System.out.println("two digit number.");
		}
		else if(num >= 100 && num <=999) {
			System.out.println("three digit number.");
		}
		
	}

}
