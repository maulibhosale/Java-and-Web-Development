package thiskeyword;

public class Demo2 {
	
	String name,address ;
	
	public Demo2(String name, String address) {
		this.name = name ;
		this.address = address;
	}
	
	public void display() {
		System.out.println(name + " " + address);
	}

	public static void main(String[] args) {
		Demo2 d = new Demo2("Mauli", "Pune");
		d.display();
	}
}
