package com.capgemini.date.service;

import com.capgemini.date.MyDate;

public class MyDateTestRecords {
public  MyDate startDate;
public  MyDate endDate;
public  long expectedResult;



public MyDateTestRecords(MyDate startDate, MyDate endDate, int expectedResult) {
	
	this.startDate = startDate;
	this.endDate = endDate;
	this.expectedResult = expectedResult;
}




}
