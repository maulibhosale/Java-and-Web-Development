package inheritdemo;

public class Dog extends Animal {

	String sound;
	
	public void details(String sound) {
		this.sound = sound;
		
		System.out.println("Dog make sound of " +sound);
	}
	
}
