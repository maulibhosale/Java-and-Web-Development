package interfacedemo;

public class CD implements Media{

	@Override
	public void id() {
		// TODO Auto-generated method stub
		System.out.println("CD id: 101");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("CD description: v good CD");
	}
	
	public void playtime() {
		System.out.println("playtime is 3 hours");
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		b.id();
		b.description();
		b.pagecount();
		
		System.out.println();
		
		CD c = new CD();
		c.id();
		c.description();
		c.playtime();
	}
	
}
