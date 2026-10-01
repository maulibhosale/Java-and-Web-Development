package abstractdemo;

public abstract class Father {
	
	public abstract void a_method();
	
	public void b_method() {
		System.out.println("This is a normal method of abstract class");
	}

	public Father() {
		// TODO Auto-generated constructor stub
		System.out.println("This is constructor of abstract class");
	}
	
}
