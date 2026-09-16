package Questions;

import java.util.Scanner;

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the first number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
	
		System.out.println("Numbers before swap are " +a+" " +b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Numbers after swap are " +a+" " +b);
		
	}

}
