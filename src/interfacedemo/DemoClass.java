package interfacedemo;

public class DemoClass implements Callable,Showable
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Method");
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Void Method");
	}

	public static void main(String[] args) {
		DemoClass d = new DemoClass();
		d.show();
		d.call();
	}	
	
}
