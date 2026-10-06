package interfacedemo;

public class Child2 implements Showable,Addable{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call Method");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Method");
	}
	
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.call();
		c.show();
		c.add();
		c.add(12,15);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Add method");
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
	

	
}
