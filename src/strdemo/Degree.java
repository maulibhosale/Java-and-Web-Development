package strdemo;

import java.util.Scanner;

public class Degree {
	
	public void getDegree () {
		System.out.println("I got a degree");
	}
	
	public static void main(String[] args) {
		System.out.println("You have a degree or not ?? ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		
		
		if(s.equals("yes")) {
			Degree d = new Degree();
			d.getDegree();	
		}
		else {
			System.out.println("I didn't got a degree");
		}
		
	}

}
