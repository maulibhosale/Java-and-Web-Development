package strdemo;

public class Conversion {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer(s);
		sb.append(" on the earth");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder(s);
		sb1.insert(0, "Hi ");
		System.out.println(sb1);
	}

}
