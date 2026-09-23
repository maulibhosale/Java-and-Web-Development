package Questions;

public class Products {
	
	int productId, price ;
	String productName ;
	
	public void display(String productName, int productId, int price) {
		this.price = price;
		this.productId = productId;
		this.productName = productName;
		System.out.println("Product Information:- ");
		System.out.println("Product Name: " +productName);
		System.out.println("Product Id: " +productId);
		System.out.println("Price: " +price);
	}

}
