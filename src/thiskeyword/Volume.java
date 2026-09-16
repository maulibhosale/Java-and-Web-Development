package thiskeyword;

public class Volume {

	int l, b, w;
	
	public Volume(int l) {
		this.l = l;
		this.b = 1;
		this.w = 1;
	}
	
	public Volume(int l, int b, int h) {
		this.l = l;
		this.b = b;
		this.w = h;
	}
	
	public void calculate() {
		int v = l * b * w;
		System.out.println(v);
	}
	
	public static void main(String[] args) {
		Volume m = new Volume(3,4,5);
		m.calculate();
	}
	
}
