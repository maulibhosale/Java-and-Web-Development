package superdemo;

public class ParentClass {
	
	String name = "Ram";
	
	public void display() {
		System.out.println("This is display ");
	}

	public ParentClass(int a, int b) {
		System.out.println("This is parent class constructor");
		System.out.println(a+b);
	}
	

}
