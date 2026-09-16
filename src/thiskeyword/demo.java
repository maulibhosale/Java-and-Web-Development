package thiskeyword;

public class demo {
	
	public demo() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		demo d = new demo();
		System.out.println(d);
		
		System.out.println();
		
		demo d1 = new demo();
		System.out.println(d1);
	}

}
