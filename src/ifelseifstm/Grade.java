package ifelseifstm;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks: ");
		double marks = sc.nextDouble();
		
		if(marks<40) {
			System.out.println("Grade D");
		}
		else if(marks >= 40 && marks <60) {
			System.out.println("Grade C");
		}
		else if(marks >= 60 && marks <80) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade A");
		}
	}

}
