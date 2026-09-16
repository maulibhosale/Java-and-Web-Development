package strdemo;

public class JavaHW {
	
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello World");
		
		System.out.println(s);
		s.insert(6, "Java ");
		System.out.println(s);
	}

}
