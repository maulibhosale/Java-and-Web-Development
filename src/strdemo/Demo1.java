package strdemo;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String s = "Happy Ganesh Chaturthi...!! Ganeshotsav 2026";            //variable
		String s1 = new String("Hello, How are You?");       //object
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println();
		
		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s.length());
		System.out.println(s1.length());
		
		System.out.println();
		
		System.out.println(s.indexOf('a'));        //first occurence
		System.out.println(s.indexOf('a', 5));
		System.out.println(s.indexOf("Gan"));
		
		System.out.println();
		
		System.out.println(s.lastIndexOf('a'));    //last occurence
		System.out.println(s.lastIndexOf("Gan"));
		
		System.out.println();
		
		System.out.println(s.indexOf("Happy"));
		System.out.println(s.lastIndexOf("Happy"));
		
		System.out.println();
		
		System.out.println(s1.indexOf('a'));        //first occurence
		System.out.println(s1.indexOf('a', 5));
		System.out.println(s1.indexOf("are"));
		
		System.out.println();
		
		System.out.println(s1.lastIndexOf('a'));    //last occurence
		System.out.println(s1.lastIndexOf("are"));
		
		System.out.println();
		
		System.out.println(s1.indexOf("Hello"));
		System.out.println(s1.lastIndexOf("Hello"));
		
		System.out.println();
		
		System.out.println(s.contains("Happyy"));
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("i"));
		
		System.out.println();
		
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,20));
		
		System.out.println();
		
		System.out.println(s.replace('a', '@'));
		
		System.out.println();
		
		System.out.println(s.concat(" ....!!!!"));
		System.out.println(s);
		
		String s2 = "Hello World";
		String s3 = "hello world";
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
	}

}
