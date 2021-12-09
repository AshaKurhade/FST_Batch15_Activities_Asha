package Activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String> ();
		
		 //Add 6 objects using add() method to the HashSet.
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		
		System.out.println("Current HashSet is: " + hs);
		 //Then print the size of the HashSet using the size() method.
		System.out.println("HashSet size is: " + hs.size());
		
		 //Remove an element using the remove() method.
		hs.remove("C");
		
		 //Also try to remove an element that is not present in the Set.
        if(hs.remove("X")) {
        	
        	System.out.println("X removed from the Set");
	
        } else {
	
        	System.out.println("X is not present in the Set");
	
        }
		 //Use the contains() method to check if an item is in the Set or not.
        System.out.println("Check if R is present: " + hs.contains("R"));
        
		 //Print the updated set.
        System.out.println("Updated HashSet is: " + hs);
		
		
	}

}
