package inheritdemo;

public class Tester extends Employee {
	
	String testingTool ;
	
	public void give(String testingTool) {
		this.testingTool = testingTool ;
		System.out.println("Testing tool: " +testingTool);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.display("Mauli", 101, 50000);
		
		Developer d = new Developer();
		d.gett("Java");
		
		Tester t = new Tester();
		t.give("Selenium");
	}

}
