package methoddemo;

public class Addition {
		
	public void add() {
		int a = 30 ;
		int b = 45 ;
		int c = a + b ;
		System.out.println(c);	
	}
	
	public void multiply() {
		int a = 12 ;
		int b = 5 ;
		int c = a * b ;
		System.out.println(c);
	}
		
	public static void main(String[] args) {
			
		Addition obj = new Addition();
		obj.add();
		obj.multiply();	
	}
}
