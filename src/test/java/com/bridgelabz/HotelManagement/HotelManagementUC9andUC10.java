package com.bridgelabz.HotelManagement;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HotelManagementUC9andUC10 {
	HotelManagement hm;

	@Before
	public void initialize() throws Exception {
		hm = new HotelManagement();

		Hotel hotel1 = new Hotel("Moody Moon", 250, 210, DateClass.StringToDate("8Sep2018"), 5, 200, 190);
		Hotel hotel1_1 = new Hotel("Moody Moon", 250, 210, DateClass.StringToDate("9Sep2018"), 5, 200, 190);
		Hotel hotel1_2 = new Hotel("Moody Moon", 250, 210, DateClass.StringToDate("10Sep2018"), 5, 200, 190);
		Hotel hotel1_3 = new Hotel("Moody Moon", 250, 210, DateClass.StringToDate("11Sep2018"), 5, 200, 190);
		Hotel hotel2 = new Hotel("Mandarin Oriental", 150, 50, DateClass.StringToDate("8Sep2018"), 4.9, 140, 40);
		Hotel hotel2_1 = new Hotel("Mandarin Oriental", 150, 50, DateClass.StringToDate("9Sep2018"), 4.9, 140, 40);
		Hotel hotel2_2 = new Hotel("Mandarin Oriental", 150, 50, DateClass.StringToDate("10Sep2018"), 4.9, 140, 40);
		Hotel hotel2_3 = new Hotel("Mandarin Oriental", 150, 50, DateClass.StringToDate("11Sep2018"), 4.9, 140, 40);
		Hotel hotel3 = new Hotel("Four Seasons", 150, 140, DateClass.StringToDate("8Sep2018"), 4, 100, 90);
		Hotel hotel3_1 = new Hotel("Four Seasons", 150, 140, DateClass.StringToDate("9Sep2018"), 4, 100, 90);
		Hotel hotel3_2 = new Hotel("Four Seasons", 150, 140, DateClass.StringToDate("10Sep2018"), 4, 100, 90);
		Hotel hotel3_3 = new Hotel("Four Seasons", 150, 140, DateClass.StringToDate("11Sep2018"), 4, 100, 90);
		Hotel hotel4 = new Hotel("Knights Inn", 250, 120, DateClass.StringToDate("8Sep2018"), 3.5, 200, 90);
		Hotel hotel4_1 = new Hotel("Knights Inn", 250, 120, DateClass.StringToDate("9Sep2018"), 3.5, 200, 90);
		Hotel hotel4_2 = new Hotel("Knights Inn", 250, 120, DateClass.StringToDate("10Sep2018"), 3.5, 200, 90);
		Hotel hotel4_3 = new Hotel("Knights Inn", 250, 120, DateClass.StringToDate("11Sep2018"), 3.5, 200, 90);
		Hotel hotel5 = new Hotel("Radisson", 150, 50, DateClass.StringToDate("8Sep2018"), 4.9, 140, 40);
		Hotel hotel5_1 = new Hotel("Radisson", 150, 50, DateClass.StringToDate("9Sep2018"), 4.9, 140, 40);
		Hotel hotel5_2 = new Hotel("Radisson", 150, 50, DateClass.StringToDate("10Sep2018"), 4.9, 140, 40);
		Hotel hotel5_3 = new Hotel("Radisson", 150, 50, DateClass.StringToDate("11Sep2018"), 4.9, 140, 40);
		Hotel hotel6 = new Hotel("Classico", 240, 120, DateClass.StringToDate("8sep2018"), 4.7, 200, 100);
		Hotel hotel6_1 = new Hotel("Classico", 240, 120, DateClass.StringToDate("9Sep2018"), 4.7, 200, 100);
		Hotel hotel6_2 = new Hotel("Classico", 240, 120, DateClass.StringToDate("10Sep2018"), 4.7, 200, 100);
		Hotel hotel6_3 = new Hotel("Classico", 240, 120, DateClass.StringToDate("11Sep2018"), 4.7, 200, 100);
		Hotel hotel7 = new Hotel("The Bay Club", 2500, 2000, DateClass.StringToDate("8Sep2018"), 5, 2000, 1900);
		Hotel hotel7_1 = new Hotel("The Bay Club", 2500, 2000, DateClass.StringToDate("9Sep2018"), 5, 2000, 1900);
		Hotel hotel7_2 = new Hotel("The Bay Club", 2500, 2000, DateClass.StringToDate("10Sep2018"), 5, 2000, 1900);
		Hotel hotel7_3 = new Hotel("The Bay Club", 2500, 2000, DateClass.StringToDate("11Sep2018"), 5, 2000, 1900);

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
	public void givenAbilityToAddWeekendRatesOfHotelShouldPassHotelManangementTest() {
		boolean result = hm.Hotels.get(0).getRewardRates() == 200 && hm.Hotels.get(0).getRewardWeekendRates() ==190;
		assertTrue(result);
	}

}
