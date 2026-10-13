package Question;

public class DroneDelivery extends DeliveryPartner {

    @Override
    public void deliver() {
        System.out.println("Drone delivery: Delivery in 10 minutes at 80 km/h");
    }

    public static void main(String[] args) {

        BikeDelivery b = new BikeDelivery();
        CarDelivery c = new CarDelivery();
        DroneDelivery d = new DroneDelivery();

        b.deliver();
        c.deliver();
        d.deliver();
    }

}
