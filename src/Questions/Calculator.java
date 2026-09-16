package Questions;

import java.util.Scanner;

public class Calculator {

	public void calculate(int a, int b) {
		int sum = a+b;
		int difference = a-b;
		int product = a*b;
		int division = a/b;
		
		System.out.println("Sum of the number is: "+sum);
		System.out.println("Difference of the number is: "+difference);
		System.out.println("Product of the number is: "+product);
		System.out.println("Division of the number is: "+division);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter number: ");
		int b = sc.nextInt();
		
		Calculator in = new Calculator();
		in.calculate(a, b);
		
	}
	
}
