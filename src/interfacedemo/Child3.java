package interfacedemo;

public class Child3 extends Demo implements Addable {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(50+50);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.add();
		c.add(21, 13);
		c.display();
	}
	
}
