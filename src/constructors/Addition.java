package constructors;

public class Addition {
	
	public Addition() {
		System.out.println(5+5);
	}
	public Addition(int y) {
		System.out.println(10+y);
	}
	public Addition(int a, int b) {
		System.out.println(a+b);
	}
	public Addition(double x) {
		System.out.println(5.2+x);
	}
	
	public static void main(String[] args) {
		Addition ad = new Addition(5.7);
	}

}
