package encapsulation;

public class Mobile {
	
	private String model, brand;
	private int price;
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setBrand("Samsung");
		m.setModel("Z-Fold");
		m.setPrice(175000);
		
		System.out.println("Mobile details:-");
		System.out.println("Brand: " +m.getBrand());
		System.out.println("Model: " +m.getModel());
		System.out.println("Price: " +m.getPrice());
		
	}

}
