package encapsulation;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setRoll(22);
		s.setName("Mauli");
		s.setAddress("Pune");
		s.setEmail("Demo@gmail.com");
		s.setMarks(55);
		
		System.out.println(s.getRoll());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getEmail());
		System.out.println(s.getMarks());
		
	}
	
}
