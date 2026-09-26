package multileveldemo;

public class Dog extends Mammals {
	
	public void bark() {
		System.out.println("Dog make sound of bark");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.walk();
		d.bark();
	}
}
