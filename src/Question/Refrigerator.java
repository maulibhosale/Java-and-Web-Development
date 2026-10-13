package Question;

public class Refrigerator extends Appliance {

    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void display() {
        System.out.println("Refrigerator Brand: " + brand);
    }

    public static void main(String[] args) {

        WashingMachine w = new WashingMachine("LG");
        Refrigerator r = new Refrigerator("Samsung");

        w.display();
        r.display();
    }

}
