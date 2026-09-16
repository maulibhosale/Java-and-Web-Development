package arraydemo;

import java.util.Scanner;

public class EvenorOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[9];
		int evencount=0;
		int oddcount=0;
		
        System.out.println("Enter the numbers : ");
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		
			if(numbers[i]%2==0) {
				evencount++ ;
			}
			else {
				oddcount++ ;
			}
		}
		System.out.println("Even numbers in array are "+evencount);
		System.out.println("Odd numbers in array are "+oddcount);
		
	}

}
