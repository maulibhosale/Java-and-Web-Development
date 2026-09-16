package arraydemo;

public class Demo2 {
	
	public void display(char c[]) {
		for (char t:c) {
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		char vowels[] = {'a', 'e', 'i', 'o', 'u'};
		d.display(vowels);
		
		
	}

}
