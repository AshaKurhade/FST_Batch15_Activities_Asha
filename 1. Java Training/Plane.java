package Activities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Plane {

	private List<String> passengers ;
	private int maxPassengers;
	private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    Plane(int a){
    	int maxPassengers = a;
    	this.passengers = new ArrayList<>();
    	
    }
    
    public void onboard(String s) {
    	passengers.add(s);
    }
    
    public Date takeoff() {
    	this.lastTimeTookOf = new Date(0);
    	return lastTimeTookOf;
    
    }
    public void land() {
    	this.lastTimeLanded = new Date(0);
    	passengers.clear();
    }
    public Date getLastTimeLanded( ) {
    	return lastTimeLanded;
    }
    
    public List<String> getPassesngers() {
    	return passengers;
    }
   

}

