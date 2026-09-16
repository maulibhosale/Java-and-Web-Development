package ifelseconditionalstm;

import java.util.Scanner;

public class Adult {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("Person is Adult");
		}
		else {
			System.out.println("Person is Minor");
		}
		System.out.println("Age is " + age);
	}

}
