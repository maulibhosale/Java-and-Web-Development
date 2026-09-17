package aggregation;

public class Engine {
	
	String type;
	int horsepower;
	
	public Engine(String type, int horsepower) {
		super();
		this.type = type;
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", Horsepower=" + horsepower + "]";
	}
	
	public void printvalues() {
		System.out.println(type);
		System.out.println(horsepower);
	}
	
}
