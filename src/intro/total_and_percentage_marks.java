package intro;

public class total_and_percentage_marks {
	
	public static void main(String[] args) {
		
		/* If the marks of Robert in three subjects are 78,45 and 62 
	    respectively (each out of 100 ), write a program to calculate 
		his total marks and percentage marks. */

		int a = 78;
		
		int b = 45;
		
		int c = 62;
		
		int Total_marks = a + b + c ;
		
		int outoff_marks = 100 + 100 + 100 ;
		
		int percentage = (Total_marks * 100 ) / outoff_marks ;
		
		System.out.println(Total_marks);
		
		System.out.println(percentage);
		
	}
	
}
