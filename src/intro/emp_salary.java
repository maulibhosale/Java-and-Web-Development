package intro;

public class emp_salary {
	
	public static void main(String[] args) {
	
		int emp_id = 101;
		String emp_name = "Mauli";
		double basic_salary = 70000;
		
		double da = basic_salary * 10/100 ;
		double hra = basic_salary * 15/100 ;
		double gross_salary = basic_salary + da + hra ;
		
		System.out.println(emp_name);
		System.out.println(emp_id);
		System.out.println(basic_salary);
		System.out.println(da);
		System.out.println(hra);
		System.out.println(gross_salary);
		
	}

}
