package methoddemo;

public class Demo {
	
	
//modname returntype methodname() {}
	public void display() {
		System.out.println("Hello");
		System.out.println("Hi");
		System.out.println("Welcome");
		System.out.println("Java");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// classname objectname = new_keyword classname();
		Demo d = new Demo();    // to create object
		
		d.display();       // to call method ,to display the output
		d.display();
	}

}
