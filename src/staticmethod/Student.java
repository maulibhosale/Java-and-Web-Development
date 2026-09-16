package staticmethod;

public class Student {

	public  static void display(String name, int id, int marks) {
		System.out.println(name+ " ,roll no " +id+ " has scored " +marks+ " marks.");
	}
	
	public static void main(String[] args) {
		display("Mauli",21,550);
		display("Rahul",22,522);
		display("John",23,500);
		display("Joy",24,530);
		
	}
}
