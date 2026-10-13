package Question;

public abstract class Appliance {

    String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public abstract void display();

}
