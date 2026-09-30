package abstractdemo;

public class Guitar extends Instrument {

	@Override
	public void functionPlay() {
		// TODO Auto-generated method stub
		System.out.println("guitar is playing  tin tin tin tin");
	}

	public static void main(String[] args) {
		
		Guitar g = new Guitar();
		g.functionPlay();
		
		System.out.println();
		
		Piano p = new Piano();
		p.functionPlay();
		
		System.out.println();
		
		Flute f = new Flute();
		f.functionPlay();
	}

}
