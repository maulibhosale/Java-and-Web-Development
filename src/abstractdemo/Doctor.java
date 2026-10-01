package abstractdemo;

import java.util.Scanner;

public class Doctor extends Person {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void readdetails() {
		// TODO Auto-generated method stub
		System.out.print("Enter Doctor Specialization: ");
		specialization = sc.next();	
	}

	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		System.out.println("Doctor Specialization: " +specialization);	
	}
	
	public static void main(String[] args) {
		Engineer e = new Engineer();
		e.readdetails();
		e.showdetails();
		
		System.out.println();
		
		Doctor d = new Doctor();
		d.readdetails();
		d.showdetails();
	}
	
}
