package finaldemo;

class Parent {
	
	public void display() {
		final int x = 9;
		System.out.println("Display Method");
	}

}

public class Demo extends Parent{

	@Override
	public void display() {
		System.out.println("Display");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
	
	
	
}
