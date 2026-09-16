package arraydemo;

import java.util.Scanner;

public class Sale {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int apple_sales[] = new int[7];
		int sum =0;
		System.out.println("Enter apple sales in a week: ");
		
		for (int i=0; i<apple_sales.length ; i++) {
			apple_sales[i]=sc.nextInt();
		}
		
	
		System.out.println();
		
		for (int t:apple_sales) {
			System.out.println(t);
			sum = sum + t;
		}
		
		System.out.println();
		
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + (sum /apple_sales.length));
		
	}

}
