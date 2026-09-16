package userinput;

import java.util.Scanner;

public class YearsToDays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age_years = sc.nextInt();
		
		int days = 365 * age_years;
		System.out.println("Your age is " + age_years + " years which is equal to " + days + " days.");
	}

}
