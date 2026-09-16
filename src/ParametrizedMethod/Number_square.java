package ParametrizedMethod;

public class Number_square {
	
	public void number(int num) {
		int sq = num * num;
		System.out.println (num + " square is " + sq);
	}
	
	public static void main(String[] args) {
		Number_square obj = new Number_square();
		obj.number(4);
		obj.number(39);
		obj.number(28);
		obj.number(17);
	}

}
