package aggregation;

public class Car {
	
	String name;
	int Year;
	Engine e;
	
	public Car(String name, int year, Engine e) {
		super();
		this.name = name;
		Year = year;
		this.e = e;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", Year=" + Year + ", e=" + e + "]";
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(Year);
		System.out.println(e);
		//e.printvalues();
	}
	
	public static void main(String[] args) {
		Engine er = new Engine("3cylinder", 70);
		Car c = new Car("Lexus", 2026, er);
		c.display();
	}

	
	

}
