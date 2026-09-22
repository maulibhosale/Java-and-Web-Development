package Questions;

public class Mobile extends Electronics {
	
	public int BatteryCapacity;
	
	public void gett(int BatteryCapacity) {
		this.BatteryCapacity = BatteryCapacity;
		System.out.println("Mobile has " +BatteryCapacity+ "% Battery Capacity.");
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.display("Samsung", 80000);
		m.gett(96);
	}	
}
