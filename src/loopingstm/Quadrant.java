package loopingstm;

import java.util.Scanner;

public class Quadrant {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input coordinates (x,y) :");
		int x = in.nextInt();
		int y = in.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("First quadrant");
		}
		else if ( x>0 && y<0) {
			System.out.println("Second quadrant");
		}
		else if ( x<0 && y<0) {
			System.out.println("Third quadrant");
		}
		else if ( x<0 && y>0) {
			System.out.println("Fourth Quadrant");
		}
		else {
			System.out.println("Number is on the axis ");
		}
		
	}

}
