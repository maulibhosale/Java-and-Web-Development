package aggregation;

public class User {
	
	int id;
	String name;
	Address add;     // ref obj/variable
	
	public User(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		//System.out.println(add);
		add.printvalue();
	}
	
	public static void main(String[] args) {
		Address a = new Address("Pune", "Maharashtra", "India");
		User u = new User(101, "Ram", a);
		//System.out.println(u);
		u.display();
		
	}
	

}
