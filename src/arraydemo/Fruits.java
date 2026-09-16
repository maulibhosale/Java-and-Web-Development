package arraydemo;

import java.util.Scanner;

public class Fruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		String fruits[] = new String[n];
		
		for(int i=0; i<fruits.length; i++) {
			System.out.println("Enter Fruit for " +i+ " index");
			fruits[i] = sc.next();
		}
		
		System.out.println();
		
		for(String s:fruits) {
			System.out.println(s);
		}
		
	}
	
}
