package inheritdemo;

public class Cat extends Dog{

	String says;
	
	public void give(String says) {
		this.says = says;
		
		System.out.println("Cat sounds as " +says);
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat("Dog", 5);
		d.details("Bark");
		
		System.out.println();
		
		Cat c = new Cat();
		c.eat("Cat", 3);
		c.give("Meow");
		
	}
	
}
