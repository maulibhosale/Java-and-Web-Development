package strdemo;

public class Demo2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("Welcome");
		System.out.println(sb1);
		
		sb.append(" World");
		sb1.append(" to the MS");
		
		System.out.println(sb);
		System.out.println(sb1);
		
		System.out.println();
		
		System.out.println(sb.length());
		System.out.println(sb.indexOf("Wo"));
		System.out.println(sb.lastIndexOf("Wo"));
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(2));
		System.out.println(sb.substring(3, 9));
		
		System.out.println();
		
		System.out.println(sb1.length());
		System.out.println(sb1.indexOf("We"));
		System.out.println(sb1.lastIndexOf("We"));
		System.out.println(sb1.charAt(2));
		System.out.println(sb1.substring(2));
		System.out.println(sb1.substring(5, 16));
		
		System.out.println();
		
		sb.insert(0, "Hi ");
		System.out.println(sb);
		
		sb.replace(0, 2, "Ohh");
		System.out.println(sb);
		
		System.out.println();
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.deleteCharAt(6);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
	
}
