package Activities;

public class CustomException extends Exception {

	String message;
	
	CustomException(String s){
		message = s;
	}
	@Override
	public String getMessage() {
		return message;
	}
	
}
