package Variables;

public class Student {
	
	int sid;
	String sname, saddress;
	
	public void init(int id, String name, String add) {
		sid=id;
		sname=name;
		saddress=add;
	}
	
	public void display() {
		System.out.println(sid + " " + sname + " " + saddress );
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.init(101, "John", "Pune");
		s.display();
	}

}
