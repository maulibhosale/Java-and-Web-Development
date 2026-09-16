package ifelseifstm;

public class Bonus {
	
	public void check(int experience, int salary) {
		
		double bonus;
		double total_amount;
		if(experience > 10) {
			bonus = 0.10 * salary;
			total_amount = salary + bonus;
			System.out.println(total_amount);
		}
		else if(experience >= 6 &&  experience < 10) {
			bonus = 0.08 * salary;
			total_amount = salary + bonus;
			System.out.println(total_amount);
		}
		else {
			bonus = 0.05 * salary;
			total_amount = salary + bonus;
			System.out.println(total_amount);
		}
	}
	
	public static void main(String[] args) {
		Bonus b = new Bonus();
		b.check(12, 20000);
		
		
	}

}
