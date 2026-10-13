package Question;

public class Rectangle extends Shape {

    public Rectangle() {
        super("Rectangle");
        System.out.println("Rectangle created");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
    }

}