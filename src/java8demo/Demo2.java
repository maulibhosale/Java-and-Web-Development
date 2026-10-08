package java8demo;

@FunctionalInterface
interface Showable{
	void show();
	default void display() {
		System.out.println("Display Method");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
		Showable s =()->System.out.println("Show Method");
		s.show();
		s.display();
	}
}
