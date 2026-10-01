package abstractdemo;

public class Designer  extends Freelancer {

	public Designer(String name, String projectName, double ratePerHour) {
		super(name, projectName, ratePerHour);
	}

	@Override
	public double calculateEarnings(int hours) {
		// TODO Auto-generated method stub
		return hours * ratePerHour;
	}
	
	public static void main(String[] args) {
		Developer d = new Developer("Mauli", "FrontEnd", 800);
		d.calculateEarnings(50);
		d.showDetails(50);
		
		System.out.println();
		
		Designer e = new Designer("Omkar", "Top-bottom", 400);
		e.calculateEarnings(50);
		e.showDetails(50);
		
	}

}
