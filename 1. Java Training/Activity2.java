package Activities;

public class Activity2 {

	public static void main(String[] args) {
		
		int a[]= new int[6];
		a[0] = 10;
		a[1] = 77;
		a[2] = 10;
		a[3] = 54;
		a[4] = -11;
		a[5] = 10;
		int b = 0;
		
		for (int i=0; i< a.length; i++) {
			if (a[i] == 10) {
				
				b = b + a[i];
				
			}
		}
		
		if (b == 30) {
		System.out.println("The sum of 10's is:" + b);
		}
	}
	
}

