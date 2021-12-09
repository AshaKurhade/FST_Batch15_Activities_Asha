package Activities;

public class MountainBike extends Bicycle {
	
	int seatHeight;
	
	MountainBike(int gear, int sp, int s){
		super (gear, sp);
		seatHeight = s;
		
	}
	public void seatHeight(int newValue) {
	    seatHeight = newValue;
	    //return seatHeight;
	}
	
	public String bicycleDesc() {
		return(super.bicycleDesc() + "Seat Height is: " + seatHeight );
	}

}
