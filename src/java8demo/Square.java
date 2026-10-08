package java8demo;


interface sqr{
	int solve(int num);
}

public class Square {
	
	public static void main(String[] args) {
		
		sqr s = num -> {return num*num; };
		System.out.println(s.solve(12));
		
	}

}
