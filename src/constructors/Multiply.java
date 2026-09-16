package constructors;

public class Multiply {
	
	public void product() {
		int a = 4;
		int b = 6;
		int c = a*b;
		System.out.println(c);
	}
	
	public Multiply() {
		int x = 3;
		int y = 5;
		int z = x * y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Multiply d = new Multiply();
		d.product();
	}

}
