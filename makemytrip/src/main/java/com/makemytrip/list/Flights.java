package com.makemytrip.list;


import com.makemytrip.pojo.TripPojo;

public class Flights {
	public static void main( String[] args ){
		TripList flight=new TripList();
		flight.addFlights(new TripPojo("airasia",6,7,5000,"bangalore","Goa",1));
		flight.addFlights(new TripPojo("jetairways",9,12,8000,"bangalore","chennai",3));
		flight.addFlights(new TripPojo("airindia",7,8,4000,"bangalore","chennai",2));
		flight.addFlights(new TripPojo("indigo",10,13,15000,"bangalore","chennai",1));
		flight.addFlights(new TripPojo("kingfisher",16,18,5000,"delhi","Goa",2));
		flight.addFlights(new TripPojo("emirates",8,13,5000,"delhi","dubai",4));
		
		for(TripPojo trip:flight.getAllFlightDetails()){
			System.out.println(trip);
		}
		
System.out.println("=======================================================");
		
		System.out.println(flight.getByFlightNo(3));
		
		System.out.println("=======================================================");
		
		/*for(TripPojo trip:flight.removeFlightDetails(1)){
			System.out.println(trip);
		}*/
		for(TripPojo trip:flight.updateFlightDetails(1, 11, 9)){
			System.out.println(trip);
		}
		
		System.out.println("=======================================================");
		for(TripPojo trip:flight.updateFlightDestination(2, "delhi")){
			System.out.println(trip);
		}
		
		System.out.println("=======================================================");
		for(TripPojo trip:flight.sortFlightByPrice("bangalore", "chennai")){
			System.out.println(trip);
		}
		
		System.out.println("=======================================================");
		for(TripPojo trip:flight.sortFlightByTime("bangalore", "chennai")){
			System.out.println(trip);
		}

		System.out.println("=======================================================");
		for(TripPojo trip:flight.morningFlight("bangalore", "chennai")){
			System.out.println(trip);
		}
	}
}
