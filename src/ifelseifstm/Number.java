package ifelseifstm;

public class Number {
	
	public void check(int num) {
		if (num < 0) {
			int display = -1 * num;
			System.out.println(display);
		}
		else {
			System.out.println(num);
		}
		
	}
	
	public static void main(String[] args) {
		Number n = new Number();
		n.check(3);
		n.check(-1);
	}

}
