package superdemo;

public class Child extends Parent {

	int message = 101;
	
	public void display() {
		System.out.println("Child message (normal) : " + message);
		System.out.println("Parent message (super) : " +super.message);
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}


}
