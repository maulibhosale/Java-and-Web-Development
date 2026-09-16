package userinput;

import java.util.Scanner;

public class FullAddress {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the house number: ");
		int h_no = sc.nextInt();
		
		System.out.print("Enter the street name: ");
		String s_name = sc.next();
		
		System.out.print("Enter the city name: ");
		String c_name = sc.next();
		
		System.out.println("Full Address: House No. " + h_no + ", " + s_name + ", " + c_name + ".");
		
		
	}

}
