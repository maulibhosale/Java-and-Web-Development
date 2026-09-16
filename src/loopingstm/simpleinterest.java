package loopingstm;

import java.util.Scanner;

public class simpleinterest {
	
	public static void main(String[] args) {
		
		// principal amount is 10000.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount p: ");
		int p = sc.nextInt();
		
		System.out.print("Enter rate in percent r: ");
		double r = sc.nextDouble();
		
		System.out.print("Enter time in months t: ");
		int t = sc.nextInt();
		
		double si = ( p * r * t ) / 100 ;
		
		if(si > 15000) {
			System.out.println("high");
		}
		else if (si > 13000) {
			System.out.println("moderate");
		}
		else {
			System.out.println("low");
		}
		
		
	}

}
