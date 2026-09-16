package ParametrizedMethod;

public class Welcome {
	
	public void msg(String user_name, String city) {
		System.out.println("Welcome " + user_name + " from " + city + "!");
	}
	
	public static void main(String[] args) {
		Welcome a = new Welcome();
		a.msg("Mauli", "Pune");
		a.msg("Omkar", "Chennai");
		a.msg("Yash", "Panjim");
	}

}
