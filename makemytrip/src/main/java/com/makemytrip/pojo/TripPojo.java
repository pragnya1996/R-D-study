package com.makemytrip.pojo;

public class TripPojo {
int flightNo;
String airlines;
int ArrivalTime;
int DepartureTime;
int cost;
String originCity;
String DestnCity;
int duration;
static int autoflightNo;

public TripPojo( String airlines, int arrivalTime,
		int departureTime, int cost, String originCity, String destnCity,
		int duration) {
	super();
	
	this.airlines = airlines;
	this.ArrivalTime = arrivalTime;
	this.DepartureTime = departureTime;
	this.cost = cost;
	this.originCity = originCity;
	this.DestnCity = destnCity;
	this.duration = duration;
}
{
	flightNo=++autoflightNo;
}

public int getFlightNo() {
	return flightNo;
}



public String getAirlines() {
	return airlines;
}

public void setAirlines(String airlines) {
	this.airlines = airlines;
}

public int getArrivalTime() {
	return ArrivalTime;
}

public void setArrivalTime(int arrivalTime) {
	ArrivalTime = arrivalTime;
}

public int getDepartureTime() {
	return DepartureTime;
}

public void setDepartureTime(int departureTime) {
	DepartureTime = departureTime;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

public String getOriginCity() {
	return originCity;
}

public void setOriginCity(String originCity) {
	this.originCity = originCity;
}

public String getDestnCity() {
	return DestnCity;
}

public void setDestnCity(String destnCity) {
	DestnCity = destnCity;
}

public int getduration() {
	return duration;
}

public void setduration(int duration) {
	this.duration = duration;
}

public static int getAutoflightNo() {
	return autoflightNo;
}

@Override
public String toString() {
	return "TripPojo [flightNo=" + flightNo + ", airlines=" + airlines
			+ ", ArrivalTime=" + ArrivalTime + ", DepartureTime="
			+ DepartureTime + ", cost=" + cost + ", originCity=" + originCity
			+ ", DestnCity=" + DestnCity + ", duration=" + duration + "]";
}



}
