package com.capgemini.datetest;

import java.util.ArrayList;

import com.capgemini.date.MyDate;
import com.capgemini.dateservice.DateDifferenceProvider;

public class DateDifferenceTest {
	
	public static void main(String args[]){
		ArrayList<MyDateTestRecord> testDate = new ArrayList<MyDateTestRecord>();
		
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(6,4,2011),0));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,4,2011),12));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,5,2011),42));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,6,2011),73));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2011),256));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2012),622));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2013),987));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2113),37511));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2413),147084));
		testDate.add(new MyDateTestRecord(new MyDate(6,4,2011),new MyDate(18,12,2813),293181));
		testDate.add(new MyDateTestRecord(new MyDate(6,1,2011),new MyDate(6,3,2011),59));
		testDate.add(new MyDateTestRecord(new MyDate(6,1,2012),new MyDate(6,3,2012),60));
		testDate.add(new MyDateTestRecord(new MyDate(6,2,2012),new MyDate(6,3,2012),29));
		testDate.add(new MyDateTestRecord(new MyDate(22,1,2012),new MyDate(15,11,2012),298));
		testDate.add(new MyDateTestRecord(new MyDate(6,2,2012),new MyDate(6,12,2012),304));
		
		for(MyDateTestRecord testCase : testDate ){
			MyDate startDate=testCase.startDate;
			MyDate endDate=testCase.endDate;
			long expectedResult=testCase.expectedResult;
			long obtainedResult=DateDifferenceProvider.getDateDifference(startDate, endDate);
			
			if(expectedResult == obtainedResult)
				System.out.println("test "+(1+testDate.lastIndexOf(testCase)) + " passed " + obtainedResult+ "=obtainedResult " +expectedResult+ "=expectedResult");
			else
				System.err.println("test "+(1+testDate.lastIndexOf(testCase)) + " failed " + obtainedResult+ "=obtainedResult " +expectedResult+ "=expectedResult");
		}
	}

}
