package com.isg.spring.utility;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

	public DateUtility() {
		// TODO Auto-generated constructor stub
	}

	 public static int differnceBeteenTwoDates()
	 {
		 java.util.Date date= new Date();
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 int day = cal.get(Calendar.DAY_OF_MONTH);
		 int month = cal.get(Calendar.MONTH);
		 int year = cal.get(Calendar.YEAR);
		 LocalDate date1 = LocalDate.of(2019, 3, 25);
	     LocalDate date2 = LocalDate.of(year, month, day);
	      System.out.println("Date 1 = "+date1);
	      System.out.println("Date 2 = "+date2);
	      Period p = Period.between(date1, date2);
	      System.out.println("Period = "+p);
	      System.out.println("Years (Difference) = "+p.getYears());
	      System.out.println("Month (Difference) = "+p.getMonths());
	      System.out.println("Days (Difference) = "+p.getDays());
	      return p.getMonths();
	 }
	 public static void main(String[] args) {
			

		}
}
