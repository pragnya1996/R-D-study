package com.parking.pojo;

import java.util.HashMap;

public class Parking {

	int compartment=1;
int section=1;
int floor=1;

HashMap<String,Customer> park=new HashMap<String,Customer>(); 
public String parkCars(Customer car){
	if(section==4 && compartment==10){
		floor++;
		section=1;
		compartment=1;
	}
	else if(compartment==10){
		section++;
		compartment=1;
	}
	String id="[Floor="+Integer.toString(floor)+",Section="+Integer.toString(section)+",Compartment="+Integer.toString(compartment)+"]";
	
	park.put(id,car );
	compartment++;
	return id;
}

public Customer getById(String id){
	return park.get(id);
}

public boolean removeById(String id){
	if(park.remove(id)!=null){
		return true;
	}else
		return false;
	
}

}




