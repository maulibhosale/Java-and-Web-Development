package superdemo;

public class SportsBike extends Bike {
	
	String model = "Kawasaki";
	
	public void display() {
		super.run();
		
		System.out.println("Child model is " +model);
		System.out.println("Parent model is " +super.model);
	}
	
	public static void main(String[] args) {
		SportsBike s = new SportsBike();
		s.display();
	}

	
}
