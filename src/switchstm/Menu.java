package switchstm;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		System.out.println("*****MENU*****");
		System.out.println("1 for even or odd");
		System.out.println("2 for +ve or -ve");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the choice: ");
		int choice = sc.nextInt();
		
		switch (choice) {
		
		case 1 : {
			
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			if (num%2==0) {
				System.out.println(num + " is even.");
			}
			else {
				System.out.println(num + " is odd.");
			}
		}
		break ;
		
		case 2 : {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println(num + " is +ve.");
			}
			else {
				System.out.println(num + " is -ve.");
			}	
		}
		break ;
		
		default : System.out.println("Enter valid choice 1 or 2");
		break;
		
		}
		
	}

}
