package Questions;

public class InPatient extends Patient {
	
	int roomNumber, DaysAdmitted, RoomCharges;
	
	public void gett(int roomNumber, int DaysAdmitted, int RoomCharges) {
		this.roomNumber = roomNumber ;
		this.DaysAdmitted = DaysAdmitted ;
		this.RoomCharges = RoomCharges ;
		
		System.out.println("Room Number: " +roomNumber+ " ; Number of Days Admitted: " +DaysAdmitted+ " ; Room Charges: " +RoomCharges);	
	}
	
	public static void main(String[] args) {
		InPatient i = new InPatient();
		i.display("Rachna", 1, 21, 814981198);
		i.gett(103, 2, 5000);
	}

}
