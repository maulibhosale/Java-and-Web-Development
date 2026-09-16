package ifelseifstm;

public class Triangle {
	
	public void sides(int a, int b , int c) {
		if (a == b && b == c && a == c) {
			System.out.println("Equilateral triangle");
		}
		else if (a!=b && b!=c && a!=c) {
			System.out.println("Scalene triangle");
		}
		else {
			System.out.println("Isoceles triangle");
		}
	}
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.sides(2, 2, 2);
		t.sides(2, 3, 1);
		t.sides(2, 2, 1);
		
	}

}
