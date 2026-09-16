package methoddemo;

public class Simpleinterest {
	
	public void si() {
		int p = 10000;  
		int r = 10;     
		int t = 12;     
		int simple_interest = (p * r * t) / 100;
		System.out.println(simple_interest);
	}
	
	public static void main(String[] args) {
		Simpleinterest obj = new Simpleinterest();
		obj.si();
	}
}
