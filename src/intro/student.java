package intro;

public class student {

	public static void main(String[] args) {
	
		String std_name = "Mauli";
		int roll_no = 101;
		String sub_1 = "Maths";
		String sub_2 = "Science";
		
		int sub_1_marks = 90;
		int sub_2_marks = 96;
		
		int max_marks = 200;
		
		double total_marks = sub_1_marks + sub_2_marks ;
		
		double percentage = (total_marks * 100 ) / max_marks ;
		
		System.out.println(std_name);
		System.out.println(roll_no);
		System.out.println(sub_1);
		System.out.println(sub_1_marks);
		System.out.println(sub_2);
		System.out.println(sub_2_marks);
		System.out.println(total_marks);
		System.out.println(percentage);
		
		
	}
	
}
