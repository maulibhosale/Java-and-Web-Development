package inheritdemo;

public class Child extends Parent {
	
	public void gett() {
		System.out.println("This is a Child Class ");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
		p.display();
		c.gett();
		c.give();
	}

}
