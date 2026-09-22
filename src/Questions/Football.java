package Questions;

public class Football extends Sports {
	
	public String goalkeeperName;

	public void Details(String goalkeeperName) {
        this.goalkeeperName = goalkeeperName;
        System.out.println("The star goalkeeper for this match is " + goalkeeperName + ".");
    }
	
	public static void main(String[] args) {
        Football f = new Football();
        f.display("Football");
        f.Details("Mauli Bhosale");
    }
	
}
