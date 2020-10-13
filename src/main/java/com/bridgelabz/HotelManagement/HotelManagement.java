package com.bridgelabz.HotelManagement;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;



public class HotelManagement {

	public List<Hotel> Hotels;
	
	public static HashMap<String, String> Days;
	public static HashMap<String, Double> nameToRateRegular;
	public static HashMap<String, Double> nameToRateReward;
	public static List<Hotel> qualifiedHotels;
	public List<Date> DateList;

	public HotelManagement() {
		Hotels = new LinkedList<Hotel>();
		DateList = new LinkedList<>();
		qualifiedHotels = new LinkedList<Hotel>();
		Days = new HashMap<>();
		nameToRateRegular = new HashMap<>();
		nameToRateReward = new HashMap<>();
		Days.put("Sunday", "Weekend");
		Days.put("Monday", "Weekday");
		Days.put("Tuesday", "Weekday");
		Days.put("Wednesday", "Weekday");
		Days.put("Thursday", "Weekday");
		Days.put("Friday", "Weekday");
		Days.put("Saturday", "Weekend");
	}

	public String getDays(String Day) {
		return Days.get(Day);
	}

	

	public void addHotel1(String Name,  double Rates,  Date date) {
		Hotel hotel = new Hotel(Name,  Rates,  date);
		Hotels.add(hotel);
	}

	
	
	
	
}
