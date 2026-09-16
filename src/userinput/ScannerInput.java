package userinput;

import java.util.*;

public class ScannerInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println(name);
		System.out.println(age);
	}

}
