package abstractdemo;

public abstract class Freelancer {
	
	String name, projectName ;
	double ratePerHour;
	
	public abstract double calculateEarnings(int hours);

	public Freelancer(String name, String projectName, double ratePerHour) {
		this.name = name;
		this.projectName = projectName;
		this.ratePerHour = ratePerHour;
	}
	
	public void showDetails(int hours) {
        System.out.println("Name: " + name);
        System.out.println("Project: " + projectName);
        System.out.println("Rate per Hour: $" + ratePerHour);
        System.out.println("Weekly Earnings: $" + calculateEarnings(hours));
        System.out.println();
    }

}
