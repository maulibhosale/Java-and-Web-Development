package strdemo;

import java.util.Scanner;

public class LanguagePreference {

	public static void main(String[] args) {
		System.out.print("Enter your favourite programming language: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String b = "Java";
		
		if(a.equals(b)) {
			System.out.println("Java is powerful!");
		}
		else {
			System.out.println(a + " is also great!");
		}
		
	}
	
}
