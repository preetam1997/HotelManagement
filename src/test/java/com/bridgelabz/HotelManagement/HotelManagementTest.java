package com.bridgelabz.HotelManagement;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HotelManagementTest {
	HotelManagement hm;

	@Before
	public void initialize() throws Exception {
		hm = new HotelManagement();

		Hotel hotel1 = new Hotel("Moody Moon", 250, DateClass.StringToDate("8Sep2018"));
		Hotel hotel2 = new Hotel("Mandarin Oriental", 200, DateClass.StringToDate("10Sep2018"));
		Hotel hotel3 = new Hotel("Four Seasons", 150, DateClass.StringToDate("11Sep2018"));
		Hotel hotel4 = new Hotel("Knights Inn", 250, DateClass.StringToDate("10Sep2018"));
		Hotel hotel5 = new Hotel("Radisson", 150, DateClass.StringToDate("10Sep2018"));
		Hotel hotel6 = new Hotel("Classico", 240, DateClass.StringToDate("9Sep2018"));
		Hotel hotel7 = new Hotel("The Bay Club", 2500, DateClass.StringToDate("10Sep2018"));
		Hotel hotel8 = new Hotel("Classico", 240, DateClass.StringToDate("10Sep2018"));
		Hotel hotel9 = new Hotel("Radisson", 150, DateClass.StringToDate("9Sep2018"));

		hm.Hotels.add(hotel1);
		hm.Hotels.add(hotel2);
		hm.Hotels.add(hotel3);
		hm.Hotels.add(hotel4);
		hm.Hotels.add(hotel5);
		hm.Hotels.add(hotel6);
		hm.Hotels.add(hotel7);
		hm.Hotels.add(hotel8);
		hm.Hotels.add(hotel9);
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

}
