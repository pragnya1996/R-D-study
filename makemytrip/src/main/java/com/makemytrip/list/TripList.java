package com.makemytrip.list;

import java.util.ArrayList;


import com.makemytrip.pojo.TripPojo;

public class TripList {
	ArrayList<TripPojo> trip=new ArrayList<TripPojo>();
	
	public void addFlights(TripPojo tri){
		trip.add(tri);
	}
	
	public ArrayList<TripPojo> getAllFlightDetails(){
		return trip;
			}
	
	public TripPojo getByFlightNo(int flightNo){
		for(TripPojo fly : trip){
			if(fly.getFlightNo()==flightNo){
				return fly;
			}
	}throw new RuntimeException("flight doesnt exist");
	}
	
	public ArrayList<TripPojo> removeFlightDetails(int flightNo){
		 trip.remove(flightNo);
		 return trip;
		}
 
	public ArrayList<TripPojo> updateFlightDetails(int flightNo,int ArrivalTime,int DepartureTime){
		for(TripPojo fly : trip){
			if(fly.getFlightNo()==flightNo){
				fly.setArrivalTime(ArrivalTime);
				fly.setDepartureTime(DepartureTime);
				return trip;
			}
	}throw new RuntimeException("flight doesnt exist");
	}
	
	public ArrayList<TripPojo> updateFlightDestination(int flightNo,String DestnCity){
		for(TripPojo fly : trip){
			if(fly.getFlightNo()==flightNo){
				fly.setDestnCity(DestnCity);
				return trip;
			}
	}throw new RuntimeException("flight doesnt exist");
	}
	
	public ArrayList<TripPojo> sortFlightByDuration(String originCity,String DestnCity){
		trip.sort((trip1, trip2)->trip1.getduration()-trip2.getduration());
		return trip;
			}
	
	public ArrayList<TripPojo> sortFlightByPrice(String source,String destination){
		trip.sort((trip1, trip2)->trip1.getCost()-trip2.getCost());
		ArrayList<TripPojo> cheapflight=new ArrayList<TripPojo>();
		
		for(TripPojo fly : trip){
			if(fly.getOriginCity().equals(source) && fly.getDestnCity().equals(destination)){
				cheapflight.add(fly);
			}
			}
		return cheapflight;
	}
	
		public ArrayList<TripPojo> sortFlightByTime(String source,String destination){
			trip.sort((trip1, trip2)->trip1.getduration()-trip2.getduration());
			ArrayList<TripPojo> flightTime=new ArrayList<TripPojo>();
			
			for(TripPojo fly : trip){
				if(fly.getOriginCity().equals(source) && fly.getDestnCity().equals(destination)){
					flightTime.add(fly);
				}
				}
			return flightTime;
}
		
	public ArrayList<TripPojo> morningFlight(String source,String destination){
		ArrayList<TripPojo> morningTime=new ArrayList<TripPojo>();
		
		for(TripPojo fly : trip){
			if(fly.getArrivalTime()<12 && fly.getDepartureTime()<12)
				morningTime.add(fly);
		}
		return morningTime;
	}
}
