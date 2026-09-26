package overridingdemo;

public class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double cal_discount() {
        if (price > 2000) {
            return price * 0.20; 
        }
        return 0.0;
    }
}