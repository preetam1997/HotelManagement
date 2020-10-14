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

	

	
	public void addDate(Date date) {
		DateList.add(date);
	}

	

	public void qualifiedHotelList(HotelManagement hm) {
		qualifiedHotels = hm.Hotels.stream()
				.filter(hotel -> DateList.stream().anyMatch(date -> hotel.getDate().compareTo(date) == 0))
				.collect(Collectors.toList());
	}

	public List<Hotel> NametoTotalRateMappingUC2(HotelManagement hm) throws Exception {

		for (Hotel hotel : qualifiedHotels) {
			if (nameToRateRegular.get(hotel.getName()) != null) {

				double totalRates = nameToRateRegular.get(hotel.getName()) + hotel.getRates();
				nameToRateRegular.put(hotel.getName(), totalRates);

			} else {

				nameToRateRegular.put(hotel.getName(), hotel.getRates());
			}

		}

		return null;
	}

	public String CheapestHotelUC2(HotelManagement hm) throws Exception {

		List<Entry<String, Double>> minEntries = new LinkedList<Entry<String, Double>>();

		double min = Double.MAX_VALUE;

		min = nameToRateRegular.entrySet().stream().min(Comparator.comparingDouble(Map.Entry::getValue)).get()
				.getValue();
		double[] minArr = { min };
		minEntries = nameToRateRegular.entrySet().stream().filter(entry -> entry.getValue() == minArr[0])
				.collect(Collectors.toList());

		String output = "";
		for (Entry entry : minEntries) {
			output = output + entry.getKey() + ", ";
		}
		output = output + "with total rates ₹" + minEntries.get(0).getValue();
		return output;
	}

	public List<Hotel> NametoTotalRateMappingUC4(HotelManagement hm) throws Exception {

		for (Hotel hotel : qualifiedHotels) {
			if (nameToRateRegular.get(hotel.getName()) != null) {

				if (Days.get(DateClass.Day(hotel.getDate())) == "Weekend") {
					double totalRates = nameToRateRegular.get(hotel.getName()) + hotel.getWeekendRates();
					nameToRateRegular.put(hotel.getName(), totalRates);
				} else {
					double totalRates = nameToRateRegular.get(hotel.getName()) + hotel.getRates();
					nameToRateRegular.put(hotel.getName(), totalRates);

				}
			} else {

				if (Days.get(DateClass.Day(hotel.getDate())) == "Weekend") {
					nameToRateRegular.put(hotel.getName(), hotel.getWeekendRates());
				} else {
					nameToRateRegular.put(hotel.getName(), hotel.getRates());

				}

			}
		}

		return null;

	}

	public List<Entry<String, Double>> CheapestHotelUC4(HotelManagement hm) throws Exception {

		List<Entry<String, Double>> minEntries = new LinkedList<Entry<String, Double>>();

		double min = Double.MAX_VALUE;

		min = nameToRateRegular.entrySet().stream().min(Comparator.comparingDouble(Map.Entry::getValue)).get()
				.getValue();
		double[] minArr = { min };

		minEntries = nameToRateRegular.entrySet().stream().filter(entry -> entry.getValue() == minArr[0])
				.collect(Collectors.toList());

		return minEntries;

	}

	public List<Hotel> CheapestandHighestRatedHotelUC6(HotelManagement hm) throws Exception {
		List<Entry<String, Double>> cheapestHotelEntries = CheapestHotelUC4(hm);

		List<Hotel> cheapestHotelWithBestRating = Hotels.stream().filter(
				hotel -> cheapestHotelEntries.stream().anyMatch(entry -> entry.getKey().matches(hotel.getName())))
				.collect(Collectors.toList());

		double maxRating = Double.MIN_VALUE;

		maxRating = cheapestHotelWithBestRating.stream().max(Comparator.comparing(Hotel::getRating)).get().getRating();
		double[] maxArr = { maxRating };
		List<Hotel> cheapestHotelWithMaxRating = cheapestHotelWithBestRating.stream()
				.filter(hotel -> hotel.getRating() == maxArr[0]).collect(Collectors.toList());

		for (int entry = 0; entry < cheapestHotelEntries.size(); entry++) {
			for (int hotel = 0; hotel < cheapestHotelWithMaxRating.size(); hotel++) {
				if (cheapestHotelEntries.get(entry).getKey().matches(cheapestHotelWithMaxRating.get(hotel).getName())) {
					cheapestHotelWithMaxRating.get(hotel).setTotalRates(cheapestHotelEntries.get(entry).getValue());
				}
			}
		}
		
		Map<String,Hotel> unique = new HashMap<>();
		for(Hotel hotel: cheapestHotelWithMaxRating) {
			unique.put(hotel.getName(), hotel);
		}
		
		cheapestHotelWithMaxRating.clear();
		cheapestHotelWithMaxRating.addAll(unique.values());
		return cheapestHotelWithMaxRating;

	}
	
	public List<Hotel> hotelWithMaxRating(HotelManagement hm) throws Exception {

		double maxRating = Double.MIN_VALUE;

		maxRating = qualifiedHotels.stream().max(Comparator.comparing(Hotel::getRating)).get().getRating();
		System.out.println(maxRating);
		double[] maxArr = { maxRating };
		List<Hotel> hotelsWithMaxRating = qualifiedHotels.stream().filter(hotel -> hotel.getRating() == maxArr[0])
				.collect(Collectors.toList());
		Map<String,Hotel> unique = new HashMap<>();
		for(Hotel hotel: hotelsWithMaxRating) {
			unique.put(hotel.getName(), hotel);
		}
		
		hotelsWithMaxRating.clear();
		hotelsWithMaxRating.addAll(unique.values());
		
		return hotelsWithMaxRating;
	}

}
