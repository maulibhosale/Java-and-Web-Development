package abstractdemo;

public class Developer extends Freelancer {

	public Developer(String name, String projectName, double ratePerHour) {
		super(name, projectName, ratePerHour);
	}

	@Override
	public double calculateEarnings(int hours) {
		// TODO Auto-generated method stub
		return hours * ratePerHour;
	}

}
