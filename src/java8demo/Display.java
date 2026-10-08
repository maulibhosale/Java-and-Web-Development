package java8demo;

interface Printable {
	void print(String s);
}

public class Display {

	public static void main(String[] args) {
		Printable p = (s)->System.out.println(s);
		p.print("Lambda Expression");
	}
}
