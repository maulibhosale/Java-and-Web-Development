package Variables;

public class Students {
	
	int id;
	String name, address;
	
	public void init(int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void display() {
		System.out.println(id + " " + name + " " + address );
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.init(101, "John", "Pune");
		s.display();
	}

}
