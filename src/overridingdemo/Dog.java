package overridingdemo;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
		System.out.println("Dog make sound of Bark");
	}

	
	
}
