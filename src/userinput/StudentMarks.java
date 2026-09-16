package userinput;

import java.util.Scanner;

public class StudentMarks {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name: ");
		String name = sc.next();
		
		System.out.print("Enter student roll no: ");
		int roll = sc.nextInt();
		
		System.out.print("Enter maths marks: ");
		int math = sc.nextInt();
		
		System.out.print("Enter science marks: ");
		int sci = sc.nextInt();
		
		System.out.print("Enter history marks: ");
		int his = sc.nextInt();
		
		System.out.print("Enter english marks: ");
		int eng = sc.nextInt();
		
		int total_marks = math + sci + his + eng;
		int max_marks = 400;
		
		int percentage = (total_marks * 100 ) / max_marks ;
		
		System.out.print(name + " ,roll no " + roll + ". has scored total " + total_marks + " marks and has scored " + percentage + "%.");
	}
	

}
