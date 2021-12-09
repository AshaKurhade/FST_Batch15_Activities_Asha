package Activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		////Add 5 random colours to it and print the Map to the console.
        hmap.put(1, "Pink");
        hmap.put(2, "Green");
        hmap.put(3, "Red");	
        hmap.put(4, "White");
        hmap.put(5, "Black");    
    
        System.out.println("The Original map: " + hmap);
        
        //Remove one colour using the remove() method.
        hmap.remove(3);
        
        //Check if the colour green exists in the Map using the containsValue() method.
        if(hmap.containsValue("Green")) {
        	
            System.out.println("Green exists in the Map");
	
        } else {
	
            System.out.println("Green does not exist in the Map");
	
        }
        //Print the size of the Map using the size() method.
        System.out.println("Hash Map size is: " + hmap.size());
	}

}
