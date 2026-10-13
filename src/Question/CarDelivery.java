package Question;

public class CarDelivery extends DeliveryPartner {

    @Override
    public void deliver() {
        System.out.println("Car delivery: Delivery in 20 minutes at 60 km/h");
    }

}