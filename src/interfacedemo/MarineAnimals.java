package interfacedemo;

public class MarineAnimals implements BlueWhale{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a marine animal");
	}
	
	public static void main(String[] args) {
		Mammals m = new Mammals();
		m.display();
		
		System.out.println();
		
		MarineAnimals ma = new MarineAnimals();
		ma.display();
	}
	
}
