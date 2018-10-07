package com.capgemini.date.service;

import com.capgemini.date.MyDate;

public class DateDifferenceProvider {

	private static int FEB_1 = 2;
	private static int JAN = 31;
	private static int FEB = 28;
	private static int MAR = 31;
	private static int APRIL = 30;
	private static int MAY= 31;
	private static int JUNE = 30;
	private static int JULY = 31;
	private static int AUG = 31;
	private static int SEP = 30;
	private static int OCT= 31;
	private static int NOV= 30;
	private static int DEC = 31;
	
	private static int[] date_month_year = { JAN, FEB, MAR, APRIL, MAY, JUNE,
			JULY, AUG, SEP, OCT, NOV, DEC };

	public static long getDateDifference(MyDate startDate, MyDate endDate) {

		if (sameDate(startDate, endDate) && sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return 0;

		}

		else if (sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return endDate.getDd() - startDate.getDd();
		}

		else if (sameYear(startDate, endDate)) {
			return remainigDaysInMonth(startDate) + daysInInterveningMonth(startDate, endDate)
					+ daysInLeadingMonth(endDate);
		}

		else {

			return remainingDaysInYear(startDate) + daysInInterveningYear(startDate, endDate)
					+ daysInLeadingYear(endDate);
		}

	}

	private static int daysInLeadingYear(MyDate endDate) {

		int leadingYearDays = 0;
		int intervingMonthDays = daysInInterveningMonth(new MyDate(0, 0, endDate.getYyyy()), endDate);
		int leadingDaysInMonth = endDate.getDd();
		leadingYearDays = leadingDaysInMonth + intervingMonthDays;
		return leadingYearDays;
	}

	private static int daysInInterveningYear(MyDate startDate, MyDate endDate) {
		int intervingYearDays = 0;
		for (int year= startDate.getYyyy() + 1; year< endDate.getYyyy(); year++) {
			if ((year% 4 == 0 && year% 100 != 0) || year% 400 == 0)
				intervingYearDays += 366;
			else
				intervingYearDays += 365;
		}
		return intervingYearDays;
	}

	private static boolean isLeapYear(MyDate startDate) {
		if ((startDate.getYyyy() % 4 == 0 && startDate.getYyyy() % 100 != 0) || startDate.getYyyy() % 400 == 0)
			return true;
		return false;
	}

	private static int remainingDaysInYear(MyDate startDate) {
		int remainingDays = 0;
		if (isLeapYear(startDate) && startDate.getMm() == 2)
			remainingDays = 1;
		int daysRemaining=remainigDaysInMonth(startDate);
		int intervingDays= daysInInterveningMonth(startDate,new MyDate(0, 13, startDate.getYyyy()));
		remainingDays=daysRemaining+intervingDays;
		return remainingDays;
	}

	private static int daysInLeadingMonth(MyDate endDate) {
		// System.out.println(endDate.getDd());
		return endDate.getDd();
	}

	private static int daysInInterveningMonth(MyDate startDate, MyDate endDate) {
		int intervingMonthDays = 0;
		if (isLeapYear(startDate) && startDate.getMm() < 2 && endDate.getMm() > 2)
			intervingMonthDays = 1;
		for (int i = startDate.getMm(); i < endDate.getMm() - 1; i++) {
			intervingMonthDays += date_month_year[i];
		}
		return intervingMonthDays;
	}

	private static int remainigDaysInMonth(MyDate startDate) {

		int remainDaysInMonth = 0;
		if(isLeapYear(startDate) && startDate.getMm()==2)
			remainDaysInMonth=1;
		remainDaysInMonth += date_month_year[startDate.getMm() - 1] - startDate.getDd();
        return remainDaysInMonth;

	}

	private static boolean sameYear(MyDate startDate, MyDate endDate) {

		if (startDate.getYyyy() == endDate.getYyyy())
			return true;
		else

			return false;
	}

	private static boolean sameMonth(MyDate startDate, MyDate endDate) {
		if (startDate.getMm() == endDate.getMm())
			return true;
		else

			return false;
	}

	private static boolean sameDate(MyDate startDate, MyDate endDate) {

		if (startDate.getDd() == endDate.getDd())
			return true;
		else

			return false;

	}

	
}