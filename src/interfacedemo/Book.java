package interfacedemo;

public class Book implements Media{

	@Override
	public void id() {
		// TODO Auto-generated method stub
		System.out.println("Book id: 101");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Book description: v good book");
	}
	
	public void pagecount() {
		System.out.println("Pagecount is 100 pages");
	}
	
}
