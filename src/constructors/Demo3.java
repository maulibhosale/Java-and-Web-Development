package constructors;

public class Demo3 {
	
	public void add() {
		int a = 4;
		int b = 6;
		int c = a+b;
		System.out.println(c);
	}
	
	public Demo3() {
		int x = 3;
		int y = 5;
		int sum = x + y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.add();
	}

}
