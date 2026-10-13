package Question;

public class BikeDelivery extends DeliveryPartner {

    @Override
    public void deliver() {
        System.out.println("Bike delivery: Delivery in 30 minutes at 40 km/h");
    }

}