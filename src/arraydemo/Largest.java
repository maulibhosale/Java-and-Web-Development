package arraydemo;

import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numbers[] = new int[5];
		int largest = numbers[0];
		
		System.out.println("Enter the numbers : ");
		
		for(int i=0; i<numbers.length; i++) {
			
			numbers[i] = sc.nextInt();
		
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
		}
		System.out.println("Largest number is: "+largest);
		
	}

}
