package inheritdemo;

public class Developer extends Employee {
	
	String programmingLanguage ;
	
	public void gett(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage ;
		System.out.println("Programming Language: " +programmingLanguage);
	}

}
