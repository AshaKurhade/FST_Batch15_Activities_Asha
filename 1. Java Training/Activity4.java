package Activities;

import java.util.Arrays;

public class Activity4 {
	
		
	public static void main(String[] args) {
		
		int a[] = {4,3,2,10,12,1,5,6};
		
		Activity4 obj = new Activity4();
		obj.ascendingsort(a);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(a));
			
		
	}

	    public void ascendingsort(int unsortarray[]) {
		
		for (int i=1 ; i < unsortarray.length; i++) {
			int var = unsortarray[i];
			int j = i-1;
			while (j >= 0 && var < unsortarray[j]) {
				unsortarray[j+1] = unsortarray[j];
				--j;
			}
			unsortarray[j+1] = var;
			
		}
					
		}
				
	}
	

