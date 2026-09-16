package ifelseifstm;

public class TriangleValidity {
	
	public void angles(int a, int b, int c) {
		int sum = a + b + c;
		
		if (sum == 180) {
			System.out.println("A valid triangle");
		}
		else {
			System.out.println("Invalid triangle");
		}
	}
	
	public static void main(String[] args) {
		
		TriangleValidity t = new TriangleValidity();
		t.angles(30, 60, 90);
		t.angles(45, 100, 45);
		t.angles(40, 50, 80);
		
		
	}

}
