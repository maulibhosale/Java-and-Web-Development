package Question;

public class WashingMachine extends Appliance {

    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void display() {
        System.out.println("Washing Machine Brand: " + brand);
    }

}
