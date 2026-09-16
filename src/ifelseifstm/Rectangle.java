package ifelseifstm;

import java.util.Scanner;

public class Rectangle {
	
	public void sides(int l, int b) {
		int area = l * b;
		int perimeter = 2 * l * b ;
		
		if (area > perimeter) {
			System.out.println("Area of the rectangle is greater then its perimeter");
		}
		else {
			System.out.println("Perimeter of the rectangle is greater then its area");
		}
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.sides(3, 8);
		r.sides(3, 1);
		r.sides(4, 4);
	}

}
