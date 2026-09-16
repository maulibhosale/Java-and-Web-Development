package methoddemo;

public class Box {
	
	public void Volume() {
		int l = 4;
		int b = 5;
		int h = 7;
		int vol = l * b * h;
		System.out.println(vol);
	}
	
	public static void main(String[] args) {
		Box obj = new Box();
		obj.Volume();
	}

}
