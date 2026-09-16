package arraydemo;

public class Demo3 {

	public String[] display() {
		String str[] = {"abc", "xyz", "lmn"};
		return str;
	}
	
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		
		String res[] = d.display();
		for (String s:res) {
			System.out.println(s);
		}
	}
	
}
