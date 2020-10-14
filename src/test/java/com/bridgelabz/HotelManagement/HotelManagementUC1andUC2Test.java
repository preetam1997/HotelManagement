package com.bridgelabz.HotelManagement;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

public class HotelManagementUC1andUC2Test {
	HotelManagement hm;

	@Before
	public void initialize() throws Exception {
		hm = new HotelManagement();

		Hotel hotel1 = new Hotel("Moody Moon", 200, DateClass.StringToDate("8Sep2018"));
		Hotel hotel1_1 = new Hotel("Moody Moon", 200, DateClass.StringToDate("9Sep2018"));
		Hotel hotel1_2 = new Hotel("Moody Moon", 200, DateClass.StringToDate("10Sep2018"));
		Hotel hotel1_3 = new Hotel("Moody Moon", 200, DateClass.StringToDate("11Sep2018"));
		Hotel hotel2 = new Hotel("Mandarin Oriental", 200, DateClass.StringToDate("8Sep2018"));
		Hotel hotel2_1 = new Hotel("Mandarin Oriental", 200, DateClass.StringToDate("9Sep2018"));
		Hotel hotel2_2 = new Hotel("Mandarin Oriental", 200, DateClass.StringToDate("10Sep2018"));
		Hotel hotel2_3 = new Hotel("Mandarin Oriental", 200, DateClass.StringToDate("11Sep2018"));
		Hotel hotel3 = new Hotel("Four Seasons", 150, DateClass.StringToDate("8Sep2018"));
		Hotel hotel3_1 = new Hotel("Four Seasons", 150, DateClass.StringToDate("9Sep2018"));
		Hotel hotel3_2 = new Hotel("Four Seasons", 150, DateClass.StringToDate("10Sep2018"));
		Hotel hotel3_3 = new Hotel("Four Seasons", 150, DateClass.StringToDate("11Sep2018"));
		Hotel hotel4 = new Hotel("Knights Inn", 250, DateClass.StringToDate("8Sep2018"));
		Hotel hotel4_1 = new Hotel("Knights Inn", 250, DateClass.StringToDate("9Sep2018"));
		Hotel hotel4_2 = new Hotel("Knights Inn", 250, DateClass.StringToDate("10Sep2018"));
		Hotel hotel4_3 = new Hotel("Knights Inn", 250, DateClass.StringToDate("11Sep2018"));
		Hotel hotel5 = new Hotel("Radisson", 150, DateClass.StringToDate("8Sep2018"));
		Hotel hotel5_1 = new Hotel("Radisson", 150, DateClass.StringToDate("9Sep2018"));
		Hotel hotel5_2 = new Hotel("Radisson", 150, DateClass.StringToDate("10Sep2018"));
		Hotel hotel5_3 = new Hotel("Radisson", 150, DateClass.StringToDate("11Sep2018"));
		Hotel hotel6 = new Hotel("Classico", 240, DateClass.StringToDate("8sep2018"));
		Hotel hotel6_1 = new Hotel("Classico", 240, DateClass.StringToDate("9Sep2018"));
		Hotel hotel6_2 = new Hotel("Classico", 240, DateClass.StringToDate("10Sep2018"));
		Hotel hotel6_3 = new Hotel("Classico", 240, DateClass.StringToDate("11Sep2018"));
		Hotel hotel7 = new Hotel("The Bay Club", 2500, DateClass.StringToDate("8Sep2018"));
		Hotel hotel7_1 = new Hotel("The Bay Club", 2500, DateClass.StringToDate("9Sep2018"));
		Hotel hotel7_2 = new Hotel("The Bay Club", 2500, DateClass.StringToDate("10Sep2018"));
		Hotel hotel7_3 = new Hotel("The Bay Club", 2500, DateClass.StringToDate("11Sep2018"));

		hm.Hotels.add(hotel1);
		hm.Hotels.add(hotel1_1);
		hm.Hotels.add(hotel1_2);
		hm.Hotels.add(hotel1_3);
		hm.Hotels.add(hotel2);
		hm.Hotels.add(hotel2_1);
		hm.Hotels.add(hotel2_2);
		hm.Hotels.add(hotel2_3);
		hm.Hotels.add(hotel3);
		hm.Hotels.add(hotel3_1);
		hm.Hotels.add(hotel3_2);
		hm.Hotels.add(hotel3_3);
		hm.Hotels.add(hotel4);
		hm.Hotels.add(hotel4_1);
		hm.Hotels.add(hotel4_2);
		hm.Hotels.add(hotel4_3);
		hm.Hotels.add(hotel5);
		hm.Hotels.add(hotel5_1);
		hm.Hotels.add(hotel5_2);
		hm.Hotels.add(hotel5_3);
		hm.Hotels.add(hotel6);
		hm.Hotels.add(hotel6_1);
		hm.Hotels.add(hotel6_2);
		hm.Hotels.add(hotel6_3);
		hm.Hotels.add(hotel7);
		hm.Hotels.add(hotel7_1);
		hm.Hotels.add(hotel7_2);
		hm.Hotels.add(hotel7_3);
	}

	@Test
	public void WelcomeMessage() {
		System.out.println("Welcome To Hotel Management");
	}

	@Test
	public void givenAbilityToAddNameandRatesOfHotelShouldPassHotelManangementTest() {
		boolean result = hm.Hotels.get(0).getName() == "Moody Moon";
		assertTrue(result);
	}

	@Test
	public void givenAbilityToGiveCheapestHotelHotelManangementTest() throws Exception {
		hm.addDate(DateClass.StringToDate("10Sep2018"));
		hm.addDate(DateClass.StringToDate("9Sep2018"));
		hm.addDate(DateClass.StringToDate("8Sep2018"));
		hm.qualifiedHotelList(hm);
		hm.NametoTotalRateMapping(hm);
		String output = hm.CheapestHotelUC2(hm);
		boolean result ="Radisson, Four Seasons, with total rates ₹450.0".matches(output);
		assertTrue(result);

	}

}
