package abstractdemo;

public abstract class Staff {
	
	String name, address;
	
	public abstract void display();

	public Staff(String name, String address) {
		this.name = name;
		this.address = address;
	}

}
