package overridingdemo;

public class Cat extends Animal {


	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cat make sound of Meow");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound();
		
		System.out.println();
		
		Cat c = new Cat();
		c.makeSound();
	}
	
}
