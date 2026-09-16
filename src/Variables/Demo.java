package Variables;

public class Demo {
	
	int z; // instance variable

	public void add() {
		int x = 4;
		int y = 5;   // local variable
		z = x + y;
		System.out.println(z);
	}
	
	public void display() {
		z = 66;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add();
		d.display();
	}
	
}
