package loopingstm;

import java.util.Scanner;

public class amusement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter height(in cm): ");
		int height = sc.nextInt();
		
		int min_height = 122;
		int min_age = 7;
		
		if (age >= min_age && height >= min_height) {
			System.out.println("You are eligible for the rides.");
		}
		else {
			System.out.println("You are not eligible for the rides.");
			if(age < min_age) {
				System.out.println("Because you don't meet the minimum age requirement.");
			}
			if(height < min_height) {
				System.out.println("Because you don't meet the minimum height requirement.");
			}
		}
	}

}
