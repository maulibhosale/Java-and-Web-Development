package ifelseifstm;

public class nestedifelse {
	
	public void check (int age, double wt) {
		if (age>=18) {
			System.out.println("You are eligible to donate.");
			if (wt>50) {
				System.out.println("You can donate blood.");
			}
			else {
				System.out.println("You can't donate blood.");
			}
		}
		
		else {
			System.out.println("You can not donate blood.");
		}
	}
	
	public static void main(String[] args) {
		nestedifelse d = new nestedifelse();
		d.check(19, 58);
	}

}
