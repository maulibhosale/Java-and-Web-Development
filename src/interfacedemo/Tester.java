package interfacedemo;

public class Tester implements Bonus {

	@Override
	public void calculateBonus(double salary) {
		// TODO Auto-generated method stub
		double bonus = 0.10 * salary;
		System.out.println("Tester got bonus of: " + bonus + " ; (Salary: " +salary+ ")");
	}

	public static void main(String[] args) {
		Tester t = new Tester();
		t.calculateBonus(30000.00);
		
		System.out.println();
		
		Developer d = new Developer();
		d.calculateBonus(50000.00);
		
		System.out.println();
		
		Manager m = new Manager();
		m.calculateBonus(80000.00);
	}
}
