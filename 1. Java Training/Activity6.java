package Activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		
		//maxium 10 passengers
		Plane plane = new Plane (10);
		
		//passengers onboard on plane
		plane.onboard("Peter");
		plane.onboard("Tom");
		plane.onboard("Ray");
		
		//plane take off time
		System.out.println("Plane took of at: " + plane.takeoff());
		
		//list of people in plane
		System.out.println("peple on board are: " + plane.getPassesngers());
		
		//plane is flying
		Thread.sleep(5000);
		
		//plane landed
		plane.land();
		
		//plane landed time
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
		
		System.out.println("People on the plane after landing: " + plane.getPassesngers());
		
	}

}
