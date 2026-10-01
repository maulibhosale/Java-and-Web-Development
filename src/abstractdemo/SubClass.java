package abstractdemo;

public class SubClass extends Father {

	@Override
	public void a_method() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method");
		
	}

	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.a_method();
		s.b_method();
	}

}
