package ParametrizedMethod;

public class Hello {
	
	public void hi(String name) {
		System.out.println("Hello " + name + "..!");
	}
	
	public static void main(String[] args) {
		Hello obj = new Hello();
		obj.hi("Mauli");
		obj.hi("Sahil");
		obj.hi("Om");
	}
	
}
