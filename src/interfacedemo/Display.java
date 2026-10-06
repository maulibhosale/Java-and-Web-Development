package interfacedemo;

public class Display extends Student implements Exam {

	public double percent ;
	
	public Display(String name, int rollNo, int marks1, int marks2) {
		super(name, rollNo, marks1, marks2);
	}

	@Override
	public void Percent_Cal() {
		// TODO Auto-generated method stub
		this.percent = (Marks1 + Marks2) * 100 / 200;
	}
	
	void display() {
        System.out.println("--- Student Result ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Mark 1   : " + Marks1);
        System.out.println("Mark 2   : " + Marks2);
        System.out.println("Percentage: " + percent + "%");
    }
	
	public static void main(String[] args) {
		Display d = new Display("Mauli", 21, 98, 50);
		d.Percent_Cal();
		d.display();
		
	}
	
}
