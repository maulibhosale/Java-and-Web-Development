package returnstmrmethod;

public class SquareAndCube {
	
	public int square(int num) {
		int sq = num * num;
		return sq;
	}
	
	public int cube(int num) {
		int cu = num * num * num;
		return cu;
	}
	
	public static void main(String[] args) {
		SquareAndCube d = new SquareAndCube();
		System.out.println(d.square(3));
		System.out.println(d.cube(3));
	}

}
