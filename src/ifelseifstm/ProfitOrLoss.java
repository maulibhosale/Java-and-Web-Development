package ifelseifstm;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the cost price: ");
		double cp = sc.nextInt();
		System.out.print("Enter the selling price: ");
		double sp = sc.nextInt();
		
		double profit;
		double loss;
		
		if (sp > cp) {
			System.out.println("Seller made profit.");
			profit = sp - cp;
			System.out.print("Seller made a profit of " + profit);	
		}
		else {
			System.out.println("Seller incured loss.");
			loss = cp - sp;
			System.out.print("Seller made a loss of " + loss);	
		}
		
	}
	
}
