package ParametrizedMethod;

public class firstlastname {
	
	public void name(String first_name, String last_name) {
		System.out.println("Full Name : " + first_name + " " + last_name);
	}
	
	public static void main(String[] args) {
		firstlastname n = new firstlastname();
		n.name("Mauli", "Bhosale");
		n.name("Shree", "Jadhavar");
		n.name("Om", "Raut");
		n.name("Aryan", "Gupta");
	}

}
