package inheritdemo;

public class Second extends Parents {
	
	public void snd() {
		System.out.println("This is a Second Subclass ");
	}	

	public static void main(String[] args) {
		Second s = new Second();
		Parents p = new Parents();
		First f = new First();
		p.message();
		f.fst();
		s.snd();
	
	}

}
