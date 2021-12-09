package Activities;

public class Activity12 implements Addable {

	public static void main(String[] args) {
		
		Addable ad1= (num1, num2)-> num1+num2;
		System.out.println(ad1.add(10, 20));
		
		Addable ad2= (num1, num2)-> {
			return (num1 + num2);
		};
		System.out.println(ad2.add(30, 50));
		
}

	@Override
	public int add(int num1, int num2) {
		return (num1+num2);
		
	}

}
