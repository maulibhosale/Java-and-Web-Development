package overloadingdemo;

public class Demo {
	
	int a;
	char c;
	
	public void display(int a, char c) {
		System.out.println("int is " +a+ "  and char is " +c);
	}
	
	public void display(char c, int a) {
		System.out.println("char is " +c+ "  and int is " +a);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display('$', 3);
	}

}
