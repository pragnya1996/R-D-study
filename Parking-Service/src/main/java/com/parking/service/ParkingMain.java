package com.parking.service;

import com.parking.pojo.Customer;
import com.parking.pojo.Parking;



public class ParkingMain {
public static void main(String args[]){
	Customer car1= new Customer("sanu","90876543","8:30");
	Customer car2= new Customer("rakesh","90876542","9:30");
	Customer car3= new Customer("pragnya","908765013","10:30");
	Customer car4= new Customer("prabhu","908761003","18:00");
	Customer car5= new Customer("rahul","9087654311","22:30");
	Customer car6= new Customer("tina","9087654322","13:30");
	Customer car7= new Customer("meena","9087654344","5:30");
	Customer car8= new Customer("ram","9087654355","6:30");
	Customer car9= new Customer("kiran","9087654388","12:00");
	Customer car10= new Customer("john","9087654399","11:30");
	
	Parking park=new Parking();
	System.out.println("ParkingId:"+park.parkCars(car1));
	System.out.println("ParkingId:"+park.parkCars(car2));
	System.out.println("ParkingId:"+park.parkCars(car3));
	System.out.println("ParkingId:"+park.parkCars(car4));
	System.out.println("ParkingId:"+park.parkCars(car5));
	System.out.println("ParkingId:"+park.parkCars(car6));
	System.out.println("ParkingId:"+park.parkCars(car7));
	System.out.println("ParkingId:"+park.parkCars(car8));
	System.out.println("ParkingId:"+park.parkCars(car9));
	System.out.println("ParkingId:"+park.parkCars(car10));
	
	
	System.out.println(park.getById("[Floor=1,Section=1,Compartment=7]"));
	System.out.println(park.getById("[Floor=1,Section=1,Compartment=5]"));
	System.out.println(park.getById("[Floor=1,Section=1,Compartment=3]"));
	
	System.out.println(park.removeById("[Floor=1,Section=1,Compartment=3]"));
}
}
