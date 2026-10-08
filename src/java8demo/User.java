package java8demo;

public class User implements Cloneable
{
	
	int id;
	String name, address;
	
	public User(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+" "+address);
	}
	
	public static void main(String[] args)throws Exception {
		User u = new User(101, "Ram", "Pune");
		u.display();
		User u1=(User) u.clone();
		u1.display();
	}

}
