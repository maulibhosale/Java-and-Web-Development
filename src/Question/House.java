package Question;

public class House extends Building {

    String type = "Residential";

    public void printType() {
        System.out.println("Parent type: " + super.type);
        System.out.println("Child type: " + type);
    }

    public static void main(String[] args) {
        House h = new House();
        h.printType();
    }

}