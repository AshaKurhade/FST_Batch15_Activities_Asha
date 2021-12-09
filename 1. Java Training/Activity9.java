package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList();
		myList.add("ABC");
		myList.add("PQR");
		myList.add("XYZ");
		myList.add("trq");
		myList.add("NMR");
		
		for(int i=0; i< myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("3rd position name is:" + myList.get(3));
		
		if (myList.contains("PQR")) {
			System.out.println("PQR is in the list");
		}
		
		int s = myList.size();
		System.out.println("Size of the array is: " + s);
		
		myList.remove(4);
		int s1 = myList.size();
		System.out.println("Size of the array is: " + s1);
		
		
		
		
	}

}
