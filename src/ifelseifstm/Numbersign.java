package ifelseifstm;

import java.util.Scanner;

public class Numbersign {
	
	public void num(int a) {
		
		if (a > 0) {
			System.out.println("Number is positive");
		}
		else if (a < 0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}
	
	public static void main(String[] args) {
		
		Numbersign n = new Numbersign();
		n.num(3);
		n.num(-1);
		n.num(0);
	}

}
