package strdemo;

import java.util.Scanner;

public class LoginValidation {
	
	public static void main(String[] args) {
		
		String s = "admin";
		
		System.out.print("Enter your username: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		if(s.equals(s1)) {
			System.out.println("Welcome, admin!");
		}
		else {
			System.out.println("Invalid user");
		}
		
	}

}
