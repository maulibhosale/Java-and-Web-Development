package java8demo;

interface Checkable{
	String check(int num);
}

public class Demo3 {
	
	public static void main(String[] args) {
		
		Checkable c = num->{
			if(num%2==0) {
				return "Even number";
			}
			else {
				return "Odd number";
			}
		};
		System.out.println(c.check(56));
		System.out.println(c.check(23));
	}

}
