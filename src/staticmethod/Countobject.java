package staticmethod;

public class Countobject {
	
	static int count = 0;
	
	public Countobject() {
		count++;
	}
	
	public static void main(String[] args) {
		
		Countobject d1 = new Countobject();
		Countobject d2 = new Countobject();
		Countobject d3 = new Countobject();
		Countobject d4 = new Countobject();
		
		System.out.println("No of objects created " + count);
	}
	

}
