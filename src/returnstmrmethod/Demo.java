package returnstmrmethod;

public class Demo {
	
	public String display() {         //non-parameterized method
		
		return "Welcome Mauli";
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println(d.display());
	}

}
