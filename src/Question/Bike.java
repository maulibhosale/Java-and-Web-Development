package Question;

public class Bike extends Vehicle {

    @Override
    public void run() {
        super.run();
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }

}