package com.bridgelabz.HotelManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateClass {
	
	public static Date StringToDate(String date_string) throws Exception{
		DateFormat originalFormat = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
		Date date = originalFormat.parse(date_string);
		return date;
	}
	
	public static String DateToString(Date dateToString) throws Exception {
		DateFormat targetFormat = new SimpleDateFormat("ddMMMyyyy",Locale.ENGLISH);
		String date = targetFormat.format(dateToString);
		return date;
		
	}
	
	public static String Day(Date date) throws Exception {
		DateFormat format2=new SimpleDateFormat("EEEE");
		String Day = format2.format(date);
		return Day;
	}
	public static void main(String[] args) throws Exception {
		System.out.println(DateClass.Day(DateClass.StringToDate("9Sep2018")));
	}
}

