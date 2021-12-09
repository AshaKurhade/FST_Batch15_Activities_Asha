package Activities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public void displayCharacteristics() {
		System.out.println("Car color is "+ color);
		System.out.println("Car transmission is "+ transmission);
		System.out.println("Car make is "+ make);
		System.out.println("Car tyres are "+ tyres);
		System.out.println("Car doors are "+ doors);
			
	}
	public void accelarated() {
		System.out.println("Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has stopped");
	}
	
	Car(int n1, int n2) {
		tyres=n1;
		doors=n2;
	//int tyres = 4;
	//int doors = 4;
	
}
	
}

