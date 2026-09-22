package Questions;

public class Laptop extends Electronics {
	
	public int RAM;
	public String Processor;
	
	public void give(int RAM, String Processor) {
		this.RAM = RAM;
		this.Processor = Processor;
		System.out.println("Laptop has " +RAM+ "GB RAM and " +Processor+ " Processor.");
	}
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.display("Samsung", 80000);
		l.give(360, "Intel i7");
	}
	
}
