package encapsulation;

public class Person {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 100) {
    		this.age = age;
    	}
    	else {
    		System.out.println("Enter valid age between 1-100");
    	}
	}
	
	
	
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAge(21);
		
		System.out.println(p.getAge());
	}
	
	

}
