package interfacedemo;

public class Addition implements Addable{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Add method");
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.add();
		ad.add(12,32);
	}
	
	

}
