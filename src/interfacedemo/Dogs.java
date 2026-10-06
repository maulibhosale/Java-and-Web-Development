package interfacedemo;

public class Dogs implements Animal {

	@Override
	public void cats() {}

	@Override
    public void dogs() {
		// TODO Auto-generated method stub
		System.out.println("Dogs bark");
	}
	
	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.dogs();
		
		System.out.println();
		
		Cats c = new Cats();
		c.cats();
	}
	
}
