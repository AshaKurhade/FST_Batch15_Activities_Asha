package Activities;

public class Driver {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(4,30,10);
		
		//mb.applyBrake(10);
		
		System.out.println(mb.bicycleDesc());
		
		System.out.println("Bicycle speed after decrement:" + mb.applyBrake(10));
		
		System.out.println("Bicycle speed after increment:" + mb.speedUp(90));
		
		System.out.println("Bicycle seat height is" + mb.seatHeight);
		
		
		
	}

}
