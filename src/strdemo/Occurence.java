package strdemo;

public class Occurence {
	
	public static void main(String[] args) {
		String s = "Hello, World";
		
		System.out.println(s.indexOf('o'));      // first occurence
		System.out.println(s.indexOf(','));  
		
		System.out.println();
		
		System.out.println(s.lastIndexOf('o'));    // last occurence
		System.out.println(s.lastIndexOf(',')); 
	}

}
