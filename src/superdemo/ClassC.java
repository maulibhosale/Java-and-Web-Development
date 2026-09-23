package superdemo;

public class ClassC extends ClassB{

	public ClassC(int c) {
		super(11);
		System.out.println("This is Class C "+c);
	}
	
	public static void main(String[] args) {
		ClassC in = new ClassC(9);
		
	}

	
}
