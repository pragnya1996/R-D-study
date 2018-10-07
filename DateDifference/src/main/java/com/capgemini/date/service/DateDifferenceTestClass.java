package com.capgemini.date.service;

import java.util.ArrayList;

import com.capgemini.date.MyDate;
import com.capgemini.date.service.DateDifferenceProvider;

public class DateDifferenceTestClass {

	public static void main(String[] args) {
		
		ArrayList<MyDateTestRecords> testdata=new ArrayList<MyDateTestRecords>();
		
		testdata.add(new MyDateTestRecords(new MyDate(06,02,2011),new MyDate(06,02,2011),0));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,04,2011),12));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,05,2011),42));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,06,2011),73));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,12,2011),256));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,12,2012),622));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,12,2013),987));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,12,2113),37511));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,12,2413),147084));
		testdata.add(new MyDateTestRecords(new MyDate(06,04,2011),new MyDate(18,12,2813),293181));
		testdata.add(new MyDateTestRecords(new MyDate(06,01,2011),new MyDate(06,03,2011),59));
		testdata.add(new MyDateTestRecords(new MyDate(06,01,2012),new MyDate(06,03,2012),60));
		testdata.add(new MyDateTestRecords(new MyDate(06,02,2012),new MyDate(06,03,2012),29));
		testdata.add(new MyDateTestRecords(new MyDate(22,01,2012),new MyDate(15,11,2012),298));
		testdata.add(new MyDateTestRecords(new MyDate(06,02,2012),new MyDate(06,12,2012),304));
		
		
		for(MyDateTestRecords testcase: testdata) {
			MyDate startDate=testcase.startDate;
			MyDate endDate=testcase.endDate;
			long expectedResult=testcase.expectedResult;
			long obtainedResult=DateDifferenceProvider.getDateDifference(startDate,endDate);
			
			if(expectedResult==obtainedResult) {
				System.out.println("Test " +(1 + testdata.lastIndexOf(testcase)) + " passed " + obtainedResult + ""
						+ "=obtained result " + expectedResult + "=expected result");
			}
			else
			{
				System.err.println("Test " +(1 + testdata.lastIndexOf(testcase)) + " failed " + obtainedResult + ""
						+ "=obtained result " + expectedResult + "=expected result");
			}
			
		}
		
		
		
	}
	
	
	
}
