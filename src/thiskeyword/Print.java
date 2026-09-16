package thiskeyword;

public class Print {
	
	int n;
	char c;
	
	public Print(int n, char c) {
		this.n = n;
		this.c = c;
		System.out.println(n + " " + c);
	}
	
	public Print( char c, int n) {
		this.c = c;
		this.n = n;
		System.out.println(c + " " + n);
	}
	
	public static void main(String[] args) {
		Print p = new Print(3,'$');
	}

}
