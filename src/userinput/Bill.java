package userinput;

import java.util.Scanner;

public class Bill {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter product name: ");
		String name = sc.next();
		
		System.out.print("Enter product quantity: ");
		int quantity = sc.nextInt();
		
		System.out.print("Enter product price: ");
		int price = sc.nextInt();
		
		int amount = quantity * price;
		
		System.out.println("Total amount for " + name + " (" + quantity + " units):" + amount);
	}

}
