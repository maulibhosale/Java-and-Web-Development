package arraydemo;

import java.util.Scanner;

public class Smallest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numbers[] = new int[5];
		int smallest = 0;
		
		System.out.println("Enter the numbers : ");
		
		for(int i=0; i<numbers.length; i++) {
			
			numbers[i] = sc.nextInt();
			smallest = numbers[0];
			
			if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest number is: "+smallest);
		
	}

}
