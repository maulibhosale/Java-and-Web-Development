package strdemo;

public class BigQuestion {
	
	public static void main(String[] args) {
		
		// 1.) Insert
		StringBuilder sb = new StringBuilder("Programming");
		sb.insert(0, "Java ");
		System.out.println(sb);
		
		// 2.) Delete
		StringBuffer sb1 = new StringBuffer("Hello World");
		sb1.delete(6, 11);
		System.out.println(sb1);
		
		// 3.) Replace
		StringBuilder sb2 = new StringBuilder("I love Java");
		sb2.replace(7, 11, "Python");
		System.out.println(sb2);
		
		// 4.) Character Replace
		StringBuilder sb3 = new StringBuilder("StringBuffer");
		sb3.replace(3, 4, "Z");
		System.out.println(sb3);
		
		// 5.) Chain Operations
		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.append(" java");
		sb4.insert(5, " World");
		System.out.println(sb4);
		

	}

}
