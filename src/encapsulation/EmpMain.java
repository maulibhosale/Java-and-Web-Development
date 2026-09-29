package encapsulation;

import java.util.Scanner;

public class EmpMain {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		e.setName(sc.next());
		
		System.out.print("Enter Employee Id: ");
		e.setId(sc.nextInt());
		
		System.out.print("Enter Employee Dept: ");
		e.setDept(sc.next());
		
		System.out.print("Enter Employee Salary: ");
		e.setSalary(sc.nextInt());
		
		System.out.print("Enter Employee Bonus: ");
		e.setBonus(sc.nextInt());
		sc.close();
		
		System.out.println();
		
		System.out.println("Employee details:-");
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getDept());
		System.out.println(e.getSalary());
		System.out.println(e.getBonus());
		
		
	}
	
	
	
	
	
	

}
