package ifelseifstm;

public class Height {
	
	public void check(int h) {
		
		if (h < 150) {
			System.out.println("Short");
		}
		else if (h>=150 && h<180) {
			System.out.println("Average");
		}
		else {
			System.out.println("Tall");
		}
		
	}
	
	public static void main(String[] args) {
		
		Height sc = new Height();
		sc.check(190);
		sc.check(170);
		sc.check(140);
		
	}

}
