package java8demo;

// static method/default --java9--pvt method in interface 
interface Addable {
	
	void add();        // public and abstract
	
	static void st_method() {
		System.out.println("This is static method in interface");
	}
	default void de_method() {
		System.out.println("This is default method in interface");
		pvt_method();
	}
	private void pvt_method() {
		System.out.println("This is private method in interface");
	}
	
}

public class Demo1 implements Addable{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("This is public and abstract method of interface on class");
	}
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.add();
		d.de_method();
		Addable.st_method();
	}

}


