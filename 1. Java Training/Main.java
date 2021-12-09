package Activities;

public class Main {


    public static void main(String[] a){
    	
        try {
	
          Main.exceptionTest("Will print to console");
		
            Main.exceptionTest(null); // Exception is thrown here
	
            Main.exceptionTest("Won't execute");
	
        } catch(CustomException mae) {
	
            System.out.println("Inside catch block: " + mae.getMessage());
	
        }
	
    }
	

    static void exceptionTest(String str) throws CustomException {
	
        if(str == null) {
	
            throw new CustomException("String value is null");
	
        } else {
	
            System.out.println(str);
	
        }
	
    }

}
