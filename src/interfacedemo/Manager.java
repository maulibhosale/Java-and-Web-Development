package interfacedemo;

public class Manager implements Bonus {

	@Override
	public void calculateBonus(double salary) {
		// TODO Auto-generated method stub
		double bonus = 0.20 * salary;
		System.out.println("Manager got bonus of: " + bonus + " ; (Salary: " +salary+ ")");
	}

}
