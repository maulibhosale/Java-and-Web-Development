package loopingstm;

import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your attendance: ");
		int attendance = sc.nextInt();
		
		System.out.print("Enter your marks: ");
		int marks = sc.nextInt();
		
		int min_attendance = 75;
		int min_marks = 175;
		
		if(attendance >= min_attendance && marks >= min_marks) {
			System.out.println("You can appear for exam");
		}
		else {
			System.out.println("You can't appear for exam");
			
			if(attendance < min_attendance) {
				System.out.println("Because your attendance is less");
			}
			if(marks < min_marks) {
				System.out.println("Because your marks are less");
			}
		}
		
	}

}
