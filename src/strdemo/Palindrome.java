package strdemo;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
		if (s.equals(sb)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
		
	}

}
