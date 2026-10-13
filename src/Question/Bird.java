package Question;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
    }

}
