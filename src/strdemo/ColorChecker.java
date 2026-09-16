package strdemo;

import java.util.Scanner;

public class ColorChecker {
	
	public static void main(String[] args) {
		
		String s = "blue";
		
		System.out.print("Enter your favourite color: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		
		if(s.equals(s1)) {
			System.out.println("Blue is cool!");
		}
		else {
			System.out.println("Nice choice!");
		}
		
	}

}
