package loopingstm;

public class table {
	
	public void printtable(int num) {
		
		for (int i = 1; i <=10; i++) {
			System.out.println(num +" * " +i+ " = " +(num*i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		table t = new table();
		t.printtable(11);
		t.printtable(12);
		}
		
	}


