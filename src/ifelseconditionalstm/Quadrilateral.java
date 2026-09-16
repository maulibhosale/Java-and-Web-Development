package ifelseconditionalstm;

import java.util.Scanner;

public class Quadrilateral {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and breadth of quadrilateral: ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		
		if (length == breadth) {
			System.out.println("Given quadrilateral is Square");
		}
		else {
			System.out.println("Given quadrilateral is Rectangle");
		}
	}

}
