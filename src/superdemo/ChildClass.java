package superdemo;

public class ChildClass extends ParentClass {

	public ChildClass(int a) {
		super(5,5);
		System.out.println("This is child class constructor " +a);
		System.out.println(super.name);
		super.display();
	}
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass(12);
		
	}

}
