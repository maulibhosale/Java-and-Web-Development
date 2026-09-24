package overloadingdemo;

public class Student {
	
	String name;
	int age;
	String address;
	
	public void setInfo() {
		System.out.println("Name : unknown");
		System.out.println("Age : 0");
		System.out.println("Address : not available");
	}
	
	public void setInfo(String name, int age) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : not available");
	}
	
	public void setInfo(String name, int age, String address) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setInfo("Mauli", 20, "Pune");
	}

}
