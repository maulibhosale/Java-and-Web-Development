package overloadingdemo;

public class Addition {
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void add(double a, int b) {
		System.out.println(a + b);
	}
	public void add(int a, double b) {
		System.out.println(a + b);
	}
	public void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(1, 3.5);
	}

}
