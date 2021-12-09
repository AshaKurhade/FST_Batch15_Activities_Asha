package Activities;

public class MyBook extends Book {

	public static void main(String[] args) {
		
		MyBook obj = new MyBook();
		obj.setTitle("Story book");
		System.out.println("The title is -"+" " + obj.getTitle());

	}
	
	public void setTitle(String s) {
		title = s;
	}

}
