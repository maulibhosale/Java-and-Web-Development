package java8demo;

interface Print {
	void print(String s);
}

public class Hello {

	public static void main(String[] args) {
		Print p = (s)->System.out.println(s);
		p.print("Hello World");
	}
}
