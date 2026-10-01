package abstractdemo;

public class Second extends Parent{

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}
	
	public static void main(String[] args) {
		First f = new First();
		f.message();
		
		System.out.println();
		
		Second s = new Second();
		s.message();
	}
	
}