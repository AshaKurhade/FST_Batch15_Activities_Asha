package Activities;

public class Bicycle implements BicycleParts, BicycleOperations {
	public int gears;
	public int speed;
	
	Bicycle(int gear, int sp){
		gears = gear;
		speed = sp;
		
	}
	
	public int applyBrake(int decrement) {
		int decreasedspeed = speed - decrement;
		return decreasedspeed;
	}
	public int speedUp(int increment) {
		int increasedspeed = speed + increment;
		return increasedspeed;
	}
	
	public String bicycleDesc() {
		return("No. of gears are: " + gears + "Bicycle speed is " + speed);
	}
	
}
