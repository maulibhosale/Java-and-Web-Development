package ifelseconditionalstm;

import java.util.Scanner;

public class Bonus {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Salary: ");
		int salary = sc.nextInt();
		
		System.out.print("Enter your Year of Service : ");
		int service = sc.nextInt();
		
		double bonus = 0.05 * salary;
		double total_salary = bonus + salary;
		
		if (service >= 5) {
			System.out.println("Your salary after bonus is "+total_salary);
		}
		else {
			System.out.println("Your Salary is " +salary);
		}
		
	}

}
