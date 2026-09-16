package strdemo;

import java.util.Scanner;

public class PasswordMatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password: ");
		String a = sc.next();
		
		System.out.print("Confirm your Password: ");
		String b = sc.next();
		
		if(a.equals(b)) {
			System.out.println("Password matched!");
		}
		else {
			System.out.println("Passwords do not match!");
		}
	}

}
