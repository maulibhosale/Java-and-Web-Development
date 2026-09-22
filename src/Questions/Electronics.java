package Questions;

public class Electronics {
	
	public String Brand;
	public int Price;
	
	public void display(String Brand, int Price) {
		this.Brand = Brand;
		this.Price = Price;
		System.out.println(Brand + " brand is available at " +Price);
	}
}
