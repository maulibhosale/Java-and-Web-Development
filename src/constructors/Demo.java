package constructors;

public class Demo {
	
	public Demo() {
		System.out.println("I am constructor");
	}
	
	public void display() {
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.display();
		
	}

}
