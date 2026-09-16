package userinput;

import java.util.Scanner;

public class Message {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		
		System.out.print("Welcome " + name + "..! Have a good day..");
		
	}

}
