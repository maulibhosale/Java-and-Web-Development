package Questions;

public class Cricket extends Sports {
	
	public int teamSize;
	
	public void Details(int teamSize) {
        this.teamSize = teamSize;
        System.out.println("This game is played with a team size of " + teamSize + " players.");
    }

    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.display("Cricket");
        c.Details(11);
    }

}
