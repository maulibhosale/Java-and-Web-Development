package abstractdemo;

import java.util.Scanner;

public class Engineer extends Person {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void readdetails() {
		// TODO Auto-generated method stub
		System.out.print("Enter Engineer Specialization: ");
		specialization = sc.next();	
	}

	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println("Engineer Specialization: " +specialization);	
	}
	
}
