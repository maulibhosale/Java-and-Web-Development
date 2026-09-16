package switchstm;

import java.util.Scanner;

public class Traffic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the traffic color: ");
		String color = sc.next();
		
		switch (color) {
		
		case "Red" : System.out.println("Traffic signals to Stop");
		break; 
		
		case "Yellow" : System.out.println("Traffic signals to Wait");
		break; 
		
		case "Green" : System.out.println("Traffic signals to Go");
		break; 
		
		default : System.out.println("Enter valid color");
		
		}
		
	}

}
