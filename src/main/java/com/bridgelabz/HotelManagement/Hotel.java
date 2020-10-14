package com.bridgelabz.HotelManagement;

import java.util.Date;
import java.util.Objects;

public class Hotel {

	private String Name;
	private Employee Emp;
	private Date date;
	private String Customer;
	private double Weekend_Rates;
	private double Rates;
	private double Rating;
	private Double totalRates;
	private double rewardWeekend_Rates;
	private double rewardRates;

	public Hotel(String Name,  double Rates,  Date date) {

		this.Name = Name;
		this.Rates = Rates;
		this.date = date;
	}

	

	public double getRates() {
		return Rates;
	}

	public void setRates(double rewardRates) {
		this.Rates = Rates;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public double getTotalRates() {
		return totalRates;
	}

	public void setTotalRates(Double totalRates) {
		this.totalRates = totalRates;
	}

}
