package interfacedemo;

public class Developer implements Bonus {

	@Override
	public void calculateBonus(double salary) {
		// TODO Auto-generated method stub
		double bonus = 0.15 * salary;
		System.out.println("Developer got bonus of: " + bonus + " ; (Salary: " +salary+ ")");
	}

}
