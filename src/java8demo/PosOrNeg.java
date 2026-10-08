package java8demo;

interface check{
	String num(int a);
}

public class PosOrNeg {
	public static void main(String[] args) {
		check c = (a) -> {
			if(a>=0) {
				return "Positive number";
			}
			else {
				return "Negative number";
			}
		};
		
		System.out.println(c.num(2));
		System.out.println(c.num(-2));
	}

}
