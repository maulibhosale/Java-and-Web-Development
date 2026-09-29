package encapsulation;

public class User {
	
	private String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public static void main(String[] args) {
		User u = new User();
		u.setPassword("Vir@t18");
		
		System.out.println("Password is " +u.getPassword());
	}

}
