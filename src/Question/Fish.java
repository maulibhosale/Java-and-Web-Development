package Question;


public class Fish implements Swimmable {

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }

    public static void main(String[] args) {
        Fish f = new Fish();
        f.swim();
    }

}