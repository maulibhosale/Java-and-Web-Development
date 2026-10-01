package abstractdemo;

public class PartTimeStaff extends Staff{

	int numberOfHours;
    double ratePerHour;
    
	public PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) {
		super(name, address);
		this.numberOfHours = numberOfHours;
		this.ratePerHour = ratePerHour;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Part Time Staff");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate Per Hour: " + ratePerHour);
		
	}
	
	public static void main(String[] args) {
		FullTimeStaff f = new FullTimeStaff("Mauli", "Pune", "CS", 50000);
		f.display();
		
		System.out.println();
		
		PartTimeStaff p = new PartTimeStaff("Omkar", "PCMC", 4, 300);
		p.display();
	}
    
    
}
