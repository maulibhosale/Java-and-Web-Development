package ifelseifstm;

import java.util.Scanner;

public class Discount {
	
	public static void main(String[] args) {
		
		System.out.print("Enter the total shipping amount: ");
		Scanner sc = new Scanner (System.in);
		int amt = sc.nextInt();
		
		double discount;
		double bill;
		
		if (amt > 500) {
			discount = amt * 0.20 ;
			bill = amt - discount;
			System.out.print("Your bill is: " + bill);
		}
		else if (amt <= 500 && amt > 200) {
			discount = amt * 0.10 ;
			bill = amt - discount;
			System.out.print("Your bill is: " + bill);
		}
		else {
			System.out.print("Your bill is: " + amt);
		}
		
	}

}
