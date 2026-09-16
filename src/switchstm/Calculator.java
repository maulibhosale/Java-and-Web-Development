package switchstm;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
	
		System.out.print("Enter the operator: ");
		String ch = sc.next();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		switch (ch) {
		
		case "+" : {
			int sum = a + b;
			System.out.println("Sum of the number is " + sum);
		}
		break;
		
		case "-" : {
			int dif = a - b;
			System.out.println("Difference of the number is " + dif);
		}
		break;
		
		case "*" : {
			int product = a * b;
			System.out.println("Product of the number is " + product);
		}
		break;
		
		case "/" : {
			if (b == 0) {
				System.out.println("You can't divide by zero, Enter valid inputs.");
			}
			else {
				int divide = a / b;
				System.out.println("Division of the number is " + divide);
			}	
		}
		break;
		
		default : System.out.println("Enter valid operator. ");
		break;
		}
		
		
		
	}

}
